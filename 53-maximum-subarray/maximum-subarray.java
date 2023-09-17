class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int currSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i], currSum+nums[i]);
            sum=Math.max(currSum,sum);
        }
        return sum;
    }
}