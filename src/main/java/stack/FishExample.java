package stack;

import java.util.Stack;

public class FishExample {
    public static void main(String[] args) {
        System.out.println(fish(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
        System.out.println(fish(new int[]{4, 3, 2, 1, 5}, new int[]{0, 0, 0, 0, 0}));
        System.out.println(fish(new int[]{4, 3, 2, 1, 5}, new int[]{1, 1, 1, 1, 1}));
        System.out.println(fish(new int[]{3, 4, 5, 3, 2, 1, 4}, new int[]{0, 0, 1, 1, 0, 0, 0}));
    }

    static int fish(int[] A, int[] B) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                while (!stack.empty()) {
                    if(stack.peek() < A[i]) {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                if (stack.empty()) {
                    result++;
                }
            }
        }
        return result + stack.size();
    }
}
