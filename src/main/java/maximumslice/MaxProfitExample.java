package maximumslice;

public class MaxProfitExample {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
        System.out.println(maxProfit(new int[]{222}));
    }

    static int maxProfit(int[] A) {
        if (A == null) return 0;
        int result = 0,  start = A[0];

        for (int i = 1; i < A.length; i++) {
            int temp = A[i] - start;
            if(A[i] < start)
                start = A[i];
            result = Math.max(result, temp);
        }
        return result;
    }
}
