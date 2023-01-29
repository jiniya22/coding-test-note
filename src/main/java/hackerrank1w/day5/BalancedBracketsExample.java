package hackerrank1w.day5;

import java.util.Stack;

public class BalancedBracketsExample {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced(" {{[[(())]]}}"));
    }

    public static String isBalanced(String s) {
        String result = "NO";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.empty() || stack.peek() != '(')
                        return result;
                    stack.pop();
                    break;
                case '}':
                    if(stack.empty() || stack.peek() != '{')
                        return result;
                    stack.pop();
                    break;
                case ']':
                    if(stack.empty() || stack.peek() != '[')
                        return result;
                    stack.pop();
            }
        }
        return stack.size() == 0 ? "YES" : "NO";
    }
}
