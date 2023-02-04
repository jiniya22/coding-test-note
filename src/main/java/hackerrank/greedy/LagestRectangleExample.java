package hackerrank.greedy;

import java.util.*;

public class LagestRectangleExample {
    public static void main(String[] args) {
//        System.out.println(largestRectangle(List.of(1, 2, 3, 4, 5)));
        System.out.println(largestRectangle(List.of(3, 2, 3, 1, 3)));
//        System.out.println(largestRectangle(List.of(11, 11, 10, 10, 10)));
    }

    static long largestRectangle(List<Integer> h) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int max = 0;
        while (idx < h.size()) {
            if (stack.empty() || h.get(idx) >= h.get(stack.peek())) {
                stack.push(idx++);
                continue;
            }
            max = maxArea(h, stack, max, idx);
        }
        while (!stack.empty()) {
            max = maxArea(h, stack, max, idx);
        }
        return max;
    }

    static int maxArea(List<Integer> h, Stack<Integer> stack, int max, int idx) {
        int temp = stack.pop();
        int height = h.get(temp);
        int width = stack.empty() ? idx : idx - stack.peek() - 1;
        return Math.max(width * height, max);
    }

    static long largestRectangle2(List<Integer> h) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i <= h.size(); i++) { // width
            for (int j = 0; j <= h.size() - i; j++) {
                queue.add(i * Collections.min(h.subList(j, j + i)));
            }
        }
        if(queue.isEmpty())
            return 0;
        return queue.poll();
    }
}
