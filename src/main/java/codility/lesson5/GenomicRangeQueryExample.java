package codility.lesson5;

import java.util.*;

public class GenomicRangeQueryExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(genomicRangeQuery("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
    }

    static int[] genomicRangeQuery(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        char[] arr = S.toCharArray();
        int[] a = new int[arr.length];
        int[] c = new int[arr.length];
        int[] g = new int[arr.length];

        switch (arr[0]) {
            case 'A' -> a[0]++;
            case 'C' -> c[0]++;
            case 'G' -> g[0]++;
        }

        for (int i = 1; i < arr.length; i++) {
            switch (arr[i]) {
                case 'A' -> {
                    a[i] = a[i - 1] + 1;
                    c[i] = c[i - 1];
                    g[i] = g[i - 1];
                }
                case 'C' -> {
                    a[i] = a[i - 1];
                    c[i] = c[i - 1] + 1;
                    g[i] = g[i - 1];
                }
                case 'G' -> {
                    a[i] = a[i - 1];
                    c[i] = c[i - 1];
                    g[i] = g[i - 1] + 1;
                }
                default -> {
                    a[i] = a[i - 1];
                    c[i] = c[i - 1];
                    g[i] = g[i - 1];
                }
            }
        }
        for (int i = 0; i < P.length; i++) {
            if (P[i] == 0) {
                if (a[Q[i]] > 0) {
                    result[i] = 1;
                } else if (c[Q[i]] > 0) {
                    result[i] = 2;
                } else if (g[Q[i]] > 0) {
                    result[i] = 3;
                } else {
                    result[i] = 4;
                }
            } else {
                if (a[Q[i]] > a[P[i] - 1]) {
                    result[i] = 1;
                } else if (c[Q[i]] > c[P[i] - 1]) {
                    result[i] = 2;
                } else if (g[Q[i]] > g[P[i] - 1]) {
                    result[i] = 3;
                } else {
                    result[i] = 4;
                }
            }
        }
        return result;
    }

    /**
     * 시간복잡도가 너무 커서 timeout이 납니다. prefix sum 방식을 이용해서 풀어야합니다.
     * O(N*M)
     * @param S
     * @param P
     * @param Q
     * @return
     */
    static int[] genomicRangeQuery2(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        Map<Character, Integer> factors = Map.of('A', 1, 'C', 2, 'G', 3, 'T', 4);
        for (int i = 0; i < P.length; i++) {
            int minFactor = 4;
            for (char c : S.substring(P[i], Q[i] + 1).toCharArray()) {
                if (minFactor > factors.get(c)) {
                    minFactor = factors.get(c);
                }
                if(minFactor == 1) break;
            }
            result[i] = minFactor;
        }
        return result;
    }
}
