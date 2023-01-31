package codility.lesson4;

import java.util.Arrays;

public class MaxCountersExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxCounters(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(maxCounters(5, new int[]{3, 1, 2, 4, 4, 6, 1, 5, 4, 1, 6, 2})));
        System.out.println(Arrays.toString(maxCounters(5, new int[]{3, 1, 2, 4, 4, 6, 1, 5, 4, 1, 6, 2})));

    }

    static int[] maxCounters(int N, int[] A) {
        int[] result = new int[N];
        int current = 0, max = 0;
        for (int a : A) {
            if (a == N + 1) {
                max = current;
            } else {
                if (result[a - 1] < max) {
                    result[a - 1] = max;
                }
                result[a - 1]++;
                if (current < result[a - 1]) {
                    current = result[a - 1];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < max) {
                result[i] = max;
            }
        }
        return result;
    }

    /**
     * timeout
     *
     * @param N
     * @param A
     * @return
     */
    static int[] maxCounters1(int N, int[] A) {
        int[] result = new int[N];
        int maxCount = 0;
        for (int a : A) {
            if (a == N + 1) {
                Arrays.fill(result, maxCount);
            } else {
                result[a - 1] += 1;
                if(result[a - 1] > maxCount)
                    maxCount = result[a - 1];
            }
        }
        return result;
    }

}
