package codility.lesson6;

import java.util.Arrays;

public class MaxProductOfThreeExample {
    public static void main(String[] args) {
        System.out.println(maxProductOfThree(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    static int maxProductOfThree(int[] A) {
        Arrays.sort(A);
        int r1 = A[0] * A[1] * A[A.length - 1];
        int r2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return Math.max(r1, r2);
    }
}
