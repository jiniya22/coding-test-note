package codility.lesson10;

import java.util.ArrayList;
import java.util.List;

public class FlagsExample {
    public static void main(String[] args) {
        System.out.println(flags(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    static int flags(int[] A) {
        int result = 0;
        List<Integer> peeks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peeks.add(i);
            }
        }
        int i = 1;
        while (i < peeks.size()) {
            if(A[i] % i == 0) {
                result = (A[i] + (A[i] / i)) * 2;
            }
            i++;
        }
        System.out.println(peeks);
        return result;
    }
}
