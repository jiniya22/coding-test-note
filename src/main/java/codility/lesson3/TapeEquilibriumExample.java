package codility.lesson3;

public class TapeEquilibriumExample {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 14, 3};
        System.out.println(tapeEquilibrium2(arr, 1));
        System.out.println(tapeEquilibrium2(arr, 2));
        System.out.println(tapeEquilibrium2(arr, 3));
        System.out.println(tapeEquilibrium2(arr, 4));
        System.out.println(">>> " + tapeEquilibrium(arr));
    }

    static int tapeEquilibrium(int[] A) {
        int result = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        int left = 0;
        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            int right = total - left;
            int diff = Math.abs(right - left);
            if (diff < result) {
                result = diff;
            }
        }
        return result;
    }

    static int tapeEquilibrium2(int[] A, int P) {
        int r1 = 0, r2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (i < P) {
                r1 += A[i];
            } else{
                r2 += A[i];
            }
        }
        return Math.abs(r1 - r2);
    }
}
