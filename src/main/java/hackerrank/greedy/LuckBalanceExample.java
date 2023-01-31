package hackerrank.greedy;

import java.util.*;

public class LuckBalanceExample {

    public static void main(String[] args) {
        System.out.println(luckBalance(2, List.of(List.of(5, 1), List.of(1, 1), List.of(4, 0))));
        System.out.println(luckBalance(1, List.of(List.of(5, 1), List.of(1, 1), List.of(4, 0))));
        System.out.println(luckBalance(3, List.of(List.of(5, 1), List.of(2, 1), List.of(1, 1), List.of(8, 1), List.of(10, 0), List.of(5, 0))));
    }

    static int luckBalance(int k, List<List<Integer>> contests) {
        int result = 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < contests.size(); i++) {
            int value = contests.get(i).get(0);
            if (contests.get(i).get(1) == 1) {
                queue.offer(value);
            } else {
                result += value;
            }
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            if(cnt < k) {
                result += queue.poll();
            } else {
                result -= queue.poll();
            }
            cnt++;
        }
        return result;
    }
}
