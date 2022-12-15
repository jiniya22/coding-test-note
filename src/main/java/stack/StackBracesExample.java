package stack;

import java.util.Stack;

public class StackBracesExample {
    public static void main(String[] args) {
        System.out.println(stackBraces("{{{}}{}}"));
        System.out.println(stackBraces("{{{3}}{}}"));
    }

    /**
     * 중괄호로만 이뤄진 문자열에서
     * 중괄호 쌍이 맞으면 true, 맞지 않으면 false를 리턴
     * @param str
     * @return
     */
    static boolean stackBraces(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '{':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
