package codility.lesson5;

public class MinAvgTwoSliceExample {
    public static void main(String[] args) {
        System.out.println(minAvgTwoSlice(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    static int minAvgTwoSlice(int[] A) {
        int minSlice = 0;
        double minAvg = (A[0] + A[1])/2.0;

        for (int i = 2; i < A.length; i++) {
            double temp = (A[i] + A[i - 1]) / 2.0;
            if(temp < minAvg) {
                minAvg = temp;
                minSlice = i - 1;
            }
            temp = (A[i] + A[i - 1] + A[i - 2]) / 3.0;
            if (temp < minAvg) {
                minAvg = temp;
                minSlice = i - 2;
            }
        }
        return minSlice;
    }
}
