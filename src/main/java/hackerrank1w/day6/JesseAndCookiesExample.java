package hackerrank1w.day6;

import java.util.*;

public class JesseAndCookiesExample {
    public static void main(String[] args) {
        System.out.println(cookies(9, new ArrayList<>(List.of(2, 7, 1, 3, 6, 4, 6))));
        System.out.println(cookies(7, new ArrayList<>(List.of(1, 2, 3, 9, 10, 12))));
    }

    public static int cookies(int k, List<Integer> A) {
        int result = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        A.forEach(queue::offer);
        if (queue.isEmpty() || queue.peek() > k) {
            return result;
        }
        while (queue.size() > 1 && queue.peek() < k) {
            int first = queue.poll(), second = queue.poll();
            queue.offer(first + 2 * second);
            result++;
            if (queue.peek() >= k) {
                return result;
            }
        }
        return -1;
    }

}
