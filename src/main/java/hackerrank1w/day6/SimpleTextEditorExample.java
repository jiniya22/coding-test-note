package hackerrank1w.day6;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditorExample {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        int Q = scanner.nextInt();
        stack.push("");
        while (Q > 0) {
            int ops = scanner.nextInt();
            switch (ops) {
                case 1:
                    append(scanner.next());
                    break;
                case 2:
                    delete(scanner.nextInt());
                    break;
                case 3:
                    print(scanner.nextInt());
                    break;
                default:
                    undo();
            }
            Q--;
        }
    }

    static void append(String W) {
        stack.push(stack.peek() + W);
    }

    static void delete(int k) {
        String newStr = stack.peek();
        newStr = newStr.substring(0, newStr.length() - k);
        stack.push(newStr);
    }

    static void print(int k) {
        System.out.println(stack.peek().charAt(k - 1));
    }
    static void undo() {
        stack.pop();
    }

}
