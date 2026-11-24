import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // 1. Sort the array in ascending order
        Arrays.sort(arr);
        
        // 2. Calculate the expected common difference
        int diff = arr[1] - arr[0];
        
        // 3. Check if all consecutive elements share the same difference
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
    }
}