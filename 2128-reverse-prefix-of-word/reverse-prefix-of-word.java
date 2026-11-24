class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        // If ch does not exist in word, return the original string
        if (index == -1) {
            return word;
        }
        
        char[] chars = word.toCharArray();
        int left = 0;
        int right = index;
        
        // Reverse the prefix using two pointers
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
}