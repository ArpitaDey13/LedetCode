class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1;
        int t=(n*(n-1))/2;

        for(int i:nums){
            t -=i;
        }
        return t;
    }
}