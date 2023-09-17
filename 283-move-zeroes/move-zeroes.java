class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int k:nums){
            if(k!=0){
                nums[i]=k;
                i++;
            }
        }
        while(i<=nums.length-1){
            nums[i]=0;
            i++;
        }
    }
}