class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Points to the position where the next non-zero element should go

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap only if left and right are at different indices to minimize operations
                if (left != right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }
}