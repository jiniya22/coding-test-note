package count;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneExample {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 4, 3, 1, 2, 4, 5};
        System.out.println(frogRiverOne(arr, 5));
        System.out.println(frogRiverOne(arr, 4));
    }

    static int frogRiverOne(int[] A, int X) {
        int result = -1;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            s.add(A[i]);
            if (X == s.size()) {
                result = i;
                break;
            }
        }
        return result;
    }
}
