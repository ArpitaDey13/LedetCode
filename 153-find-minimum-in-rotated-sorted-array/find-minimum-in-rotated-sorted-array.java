class Solution {
    public int findMin(int[] nums) {
        int lb = 0, ub = nums.length - 1;
        while (lb < ub) {
            int mid = lb + (ub - lb) / 2;

            // If the mid element is greater than the upper bound, it means the minimum
            // element is on the right side.
            if (nums[mid] > nums[ub]) {
                lb = mid + 1;
            }
            // If the mid element is less than or equal to the upper bound, it means the
            // minimum element is on the left side.
            else {
                ub = mid;
            }
        }
        // lb now points to the minimum element.
        return nums[lb];
    }
}
