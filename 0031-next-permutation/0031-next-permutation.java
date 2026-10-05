class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
 
        // A single value cannot move to a different permutation.
        if (n <= 1) {
            return;
        }
 
        int pivot = n - 2;
 
        // Search for the rightmost position that can be increased.
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }
 
        // A fully non-increasing array wraps around to the smallest permutation.
        if (pivot < 0) {
            reverseRange(nums, 0, n - 1);
            return;
        }
 
        int successor = n - 1;
 
        // Search from the right for the next larger value.
        while (nums[successor] <= nums[pivot]) {
            successor--;
        }
 
        int temporary = nums[pivot];
        nums[pivot] = nums[successor];
        nums[successor] = temporary;
 
        reverseRange(nums, pivot + 1, n - 1);
    }

    private void reverseRange(int[] nums, int left, int right) {
       
        while (left < right) {
            int temporary = nums[left];
            nums[left] = nums[right];
            nums[right] = temporary;
 
            left++;
            right--;
        }
    }
}