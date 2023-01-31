package codility.lesson5;

import java.util.Arrays;

public class MinAvgTwoSliceExample {
    public static void main(String[] args) {
        System.out.println(minAvgTwoSlice(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    static int minAvgTwoSlice(int[] A) {
        int[] countingArr = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            countingArr[i + 1] = countingArr[i] + A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(countingArr));
        double minAvg = (countingArr[2] - countingArr[0])/2.0;
        int startingPosition = 0;
        for (int i = 2; i < A.length; i++) {
            double temp = (countingArr[i + 1] - countingArr[i - 1])/2.0;
            if(minAvg > temp) {
                minAvg = temp;
                startingPosition = i - 1;
            }
            temp = (countingArr[i + 1] - countingArr[i - 2])/3.0;
            if(minAvg > temp) {
                minAvg = temp;
                startingPosition = i - 2;
            }
        }
        return startingPosition;
    }

    static int minAvgTwoSlice2(int[] A) {
        int startingPosition = 0;
        double minAvg = (A[0] + A[1])/2.0;

        for (int i = 2; i < A.length; i++) {
            double temp = (A[i] + A[i - 1]) / 2.0;
            if(temp < minAvg) {
                minAvg = temp;
                startingPosition = i - 1;
            }
            temp = (A[i] + A[i - 1] + A[i - 2]) / 3.0;
            if (temp < minAvg) {
                minAvg = temp;
                startingPosition = i - 2;
            }
        }
        return startingPosition;
    }
}
