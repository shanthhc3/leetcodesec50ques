class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                result.append('G');
                i += 1;
            } else if (command.charAt(i + 1) == ')') {
                // Current char is '(', next is ')' -> "()"
                result.append('o');
                i += 2;
            } else {
                // Current char is '(', next is 'a' -> "(al)"
                result.append("al");
                i += 4;
            }
        }
        
        return result.toString();
    }
}