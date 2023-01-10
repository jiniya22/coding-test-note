package sort;

import java.util.Arrays;

public class TriangleExample {
    public static void main(String[] args) {
//        System.out.println(triangle(new int[]{10, 2, 5, 1, 8, 20}));
//        System.out.println(triangle(new int[]{10, 50, 5, 1}));
        System.out.println(triangle(new int[]{2147483647, 1, 2147483647}));
    }

    static int triangle(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if((long)A[i] + (long)A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return result;
    }
}
