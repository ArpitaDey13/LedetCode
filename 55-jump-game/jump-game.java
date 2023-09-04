class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int j=n-1;
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=j){
                j=i;
            }
        }
        if(j==0)
            return true;
        else
            return false;
    }
}