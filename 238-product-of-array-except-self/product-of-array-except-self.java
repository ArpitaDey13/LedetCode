class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int c=0;
        int p=1;

        for(int i=0;i<n;i++){
            if(nums[i]==0)
                c++;
            else
                p *= nums[i];
        }

        for(int i=0;i<n;i++){
            if(c==0)
                arr[i]=p/nums[i];
            else if(c==1){
                if(nums[i]==0)
                    arr[i]=p;
            }
        }
        return arr;
    }
}