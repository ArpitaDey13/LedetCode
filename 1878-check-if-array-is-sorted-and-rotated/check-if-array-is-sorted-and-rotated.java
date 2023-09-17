class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                c++;
                if (c > 1) {
                    return false;
                }
            }
        }
        
        if (c == 0 || nums[0] >= nums[n - 1]) {
            return true;
        }
        
        return false;
    }
}
