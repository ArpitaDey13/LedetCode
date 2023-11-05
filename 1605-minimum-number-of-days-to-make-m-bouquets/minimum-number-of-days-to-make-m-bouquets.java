class Solution {
    public static boolean possible(int[] arr,int day,int m,int k){
        int n=arr.length;
        int c=0;
        int no=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                c++;
            } else {
                no += (c / k);
                c = 0;
            }
        }
        no += (c / k);
        return no >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        long val= (long) m*k;
        int n=arr.length;
        if(val>n) 
            return -1;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        int lb=min, ub=max;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if (possible(arr, mid, m, k)) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return lb;
    }
}