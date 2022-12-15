package stack;

import java.util.Stack;

/**
 * 스택을 사용하여 문자열을 뒤집기
 */
public class ReverseStringExample {
    public static void main(String[] args) {
        System.out.println(reverseString("abcde"));
        System.out.println(reverseString("apple"));
    }

    static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.add(ch);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }

}
