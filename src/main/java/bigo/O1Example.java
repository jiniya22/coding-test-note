package bigo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class O1Example {
    public static void main(String[] args) {
        array();
        queue();
        stack();
    }

    /**
     * 배열의 특정 인덱스에 들어있는 값 조회는 O(1)
     */
    static void array() {
        System.out.println("\n:: array ::");
        int[] arr = {5, 1, 22, 6, 88};
        System.out.println(arr[2]);
    }

    /**
     * queue를 peek, add, remove 할때 모두 O(1)
     */
    static void queue() {
        System.out.println("\n:: queue ::");
        Queue<Integer> queue = new LinkedList<>(List.of(5, 10, 22, 6, 3, 19));

        System.out.println("원본: " + queue);  // [5, 10, 22, 6, 3, 19]
        System.out.println("head 값: " + queue.peek());   // 5
//        System.out.println(queue);  // [5, 10, 22, 6, 3, 19]

        queue.add(9);
        System.out.println("9를 추가한 후: " + queue);  // [5, 10, 22, 6, 3, 19, 9]

        queue.remove();
        System.out.println("head를 제거한 후: " + queue);  // [10, 22, 6, 3, 19, 9]
    }

    /**
     * stack을 peek, push, pop 할때 모두 O(1)
     */
    static void stack() {
        System.out.println("\n:: stack ::");
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(5, 10, 22, 6, 3, 19));

        System.out.println("원본: " + stack); // [5, 10, 22, 6, 3, 19]
        System.out.println("top 값: " + stack.peek());   // 19
//        System.out.println(stack);  // [5, 10, 22, 6, 3, 19]

        stack.push(9);
        System.out.println("9를 추가한 후: " + stack);  // [5, 10, 22, 6, 3, 19, 9]

        stack.pop();
        System.out.println("top을 제거한 후: " + stack);  // [5, 10, 22, 6, 3, 19]
    }
}
