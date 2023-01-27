package hackerrank1w.day2;

import java.util.List;

public class DiagonalDifferenceExample {

    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9))));
        System.out.println(diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12))));
    }

    static int diagonalDifference(List<List<Integer>> arr) {
        int primary = 0, secondary = 0;
        int cnt = 0, length = arr.size();
        for (List<Integer> a : arr) {
            primary += a.get(cnt);
            secondary += a.get(length - cnt - 1);
            cnt++;
        }
        return Math.abs(primary - secondary);
    }
}
