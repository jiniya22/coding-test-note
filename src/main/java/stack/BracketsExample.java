package stack;

import java.util.Stack;

public class BracketsExample {
    public static void main(String[] args) {
        System.out.println(brackets("{[()()]}"));
        System.out.println(brackets("}))"));
        System.out.println(brackets("{}({{}})"));
    }

    static int brackets(String S) {
        Stack<Character> s = new Stack<>();
        for (char c : S.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    s.push(c);
                    break;
                case ')':
                    if (s.empty() || s.peek() != '(') {
                        return 0;
                    }
                    s.pop();
                    break;
                case ']':
                    if (s.empty() || s.peek() != '[') {
                        return 0;
                    }
                    s.pop();
                    break;
                case '}':
                    if (s.empty() || s.peek() != '{') {
                        return 0;
                    }
                    s.pop();
                    break;
            }
        }

        return s.size() > 0 ? 0 : 1;
    }
}
