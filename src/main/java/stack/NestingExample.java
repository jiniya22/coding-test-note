package stack;

import java.util.Stack;

public class NestingExample {
    public static void main(String[] args) {
        System.out.println(nesting(null));
        System.out.println(nesting(""));
        System.out.println(nesting("()"));
        System.out.println(nesting("())"));
        System.out.println(nesting("(()"));
        System.out.println(nesting("(()(())())"));
    }

    static int nesting2(String S) {
        if(S == null) return 1;
        Stack<Character> s = new Stack<>();
        for (char c : S.toCharArray()) {
            if ('(' == c) {
                s.push('(');
            } else if (s.empty()) {
                return 0;
            } else {
                s.pop();
            }
        }
        return s.empty() ? 1 : 0;
    }

    static int nesting(String S) {
        if(S == null) return 1;
        int cnt = 0;
        for (char c : S.toCharArray()) {
            if ('(' == c) {
                cnt++;
            } else if (cnt == 0) {
                return 0;
            } else {
                cnt--;
            }
        }
        return cnt == 0 ? 1 : 0;
    }
}
