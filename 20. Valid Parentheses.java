import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if (c == ')' && openBracket != '(') {
                    return false;
                }
                if (c == '}' && openBracket != '{') {
                    return false;
                }
                if (c == ']' && openBracket != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
