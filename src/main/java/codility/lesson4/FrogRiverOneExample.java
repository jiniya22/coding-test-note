package codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneExample {
    public static void main(String[] args) {
        System.out.println(permCheck(new int[]{2, 3, 1, 4}));
        System.out.println(permCheck(new int[]{4, 1, 3, 2}));
        System.out.println(permCheck(new int[]{2, 1, 4}));
        System.out.println(permCheck(new int[]{2, 1}));
    }

    static int permCheck(int[] A) {
        int result = 1;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (set.contains(a) || a > A.length) {
                result = 0;
                break;
            }
            set.add(a);
        }
        return result;
    }
}
