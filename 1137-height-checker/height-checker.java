import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // 1. Create a copy of the original array and sort it
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        // 2. Count indices where the current order differs from the expected order
        int mismatchCount = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        
        return mismatchCount;
    }
}