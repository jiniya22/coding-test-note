package hackerrank1w.day1;

import java.util.List;

public class MiniMaxSumExample {
    public static void main(String[] args) {
        miniMaxSum(List.of(1, 3, 5, 7, 9));
        miniMaxSum(List.of(1, 2, 3, 4, 5));
    }

    static void miniMaxSum(List<Integer> arr) {
        int max = 0, min = Integer.MAX_VALUE;
        long total = 0;
        for (int i : arr) {
            if(max < i) max = i;
            if(min > i) min = i;
            total += i;
        }
        System.out.printf("%d %d%n", total - max, total - min);
    }

}
