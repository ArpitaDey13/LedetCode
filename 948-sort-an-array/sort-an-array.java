class Solution {
    public static void partition(int arr[], int l, int r) {
        int mid = (l + r) / 2;
        int i = l;
        int j = mid + 1;
        int temp[] = new int[r - l + 1];
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // Copy remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy remaining elements from the right subarray
        while (j <= r) {
            temp[k++] = arr[j++];
        }
        
        // Copy the merged elements back to the original array
        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            
            // Merge the two sorted subarrays
            partition(arr, low, high);
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
