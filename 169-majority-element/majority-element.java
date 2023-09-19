class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0, e=0;
        for(int i=0;i<n;i++){
            if(c==0){
                c++;
                e=nums[i];
            }else if(e==nums[i]){
                c++;
            }else{
                c--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == e) cnt1++;
        }

        if (cnt1 > (n / 2)) return e;
        return -1;
    }
}