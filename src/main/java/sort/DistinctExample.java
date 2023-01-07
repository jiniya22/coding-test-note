package sort;

import java.util.HashSet;
import java.util.Set;

public class DistinctExample {
    public static void main(String[] args) {
        System.out.println(distinct(new int[]{2, 1, 1, 2, 3, 1}));
        System.out.println(distinct(new int[]{}));
    }

    static int distinct(int[] A) {
        Set<Integer> s = new HashSet<>();

        for (int a : A) {
            s.add(a);
        }
        return s.size();
    }
}
