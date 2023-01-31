package codility.lesson2;

import java.util.Arrays;

/**
 * List로 하는 거는 LeftRotationExample
 */
public class CyclicRotationExample {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 7, 6};
        printArray(cyclicRotation(arr, 0));
        printArray(cyclicRotation(arr, 1));
        printArray(cyclicRotation(arr, 2));
        printArray(cyclicRotation(arr, 3));

        System.out.println(">>>>>>>>>>>>>>>> ");
        int[] arr2 = {1, 2, 3, 4};
        printArray(cyclicRotation(arr2, 4));

        printArray(cyclicRotationLeft(arr, 0));
        printArray(cyclicRotationLeft(arr, 1));
        printArray(cyclicRotationLeft(arr, 2));
        printArray(cyclicRotationLeft(arr, 3));

        printArray(cyclicRotationLeft(arr2, 4));
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

    static int[] cyclicRotationLeft(int[] A, int K) {
        if(A == null || A.length < 1 || K == 0) {
            return A;
        }

        int[] result = new int[A.length];
        K %= A.length;

        for (int i = 0; i < K; i++) {
            result[A.length + i - K] = A[i];
        }
        for (int i = K; i < A.length; i++) {
            result[i - K] = A[i];
        }
//        System.arraycopy(A, 0, result, A.length - K, K);
//        System.arraycopy(A, K, result, 0, A.length - K);
        return result;
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
