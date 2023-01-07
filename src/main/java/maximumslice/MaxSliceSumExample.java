package maximumslice;

public class MaxSliceSumExample {
    public static void main(String[] args) {
        System.out.println(maxSliceSum(new int[]{3, 2, -6, 4, 0}));
        System.out.println(maxSliceSum(new int[]{-1, -3, -5, -2}));
    }

    static int maxSliceSum(int[] A) {
        if(A.length == 1) return A[0];
        int maxSum = A[0], maxSlice = A[0];

        for (int i = 1; i < A.length; i++) {
            maxSlice = Math.max(A[i], maxSlice + A[i]);
            maxSum = Math.max(maxSum, maxSlice);
        }

        return maxSum;
    }
}
