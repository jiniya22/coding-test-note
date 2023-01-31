package codility.lesson2;

import java.util.Arrays;

public class CyclicRotationExample {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 7, 6};
        printArray(cyclicRotation(arr, 0));
        printArray(cyclicRotation(arr, 1));
        printArray(cyclicRotation(arr, 2));
        printArray(cyclicRotation(arr, 3));

        int[] arr2 = {1, 2, 3, 4};
        printArray(cyclicRotation(arr2, 4));
    }
    static int[] cyclicRotation(int[] A, int K) {
        if(A == null || A.length < 1 || K == 0) {
            return A;
        }

        int[] result = new int[A.length];
        K %= A.length;
        for (int i = 0; i < A.length; i++) {
            if (i + K < A.length) {
                result[i + K] = A[i];
            } else {
                result[i + K - A.length] = A[i];
            }
        }
        return result;
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
