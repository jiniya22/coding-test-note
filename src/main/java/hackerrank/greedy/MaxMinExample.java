package hackerrank.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinExample {
    public static void main(String[] args) {
//        System.out.println(maxMin(2, new ArrayList<>(List.of(1, 4, 7, 2))));
//        System.out.println(maxMin(3, new ArrayList<>(List.of(10, 100, 300, 200, 1000, 20, 30))));
//        System.out.println(maxMin(4, new ArrayList<>(List.of(1, 2, 3, 4, 10, 20, 30, 40, 100))));
        System.out.println(maxMin(3, new ArrayList<>(List.of(100, 200, 300, 350, 400, 401, 402))));
    }

    static int maxMin(int k, List<Integer> arr) {
        int result = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i <= arr.size() - k; i++) {
            int temp = arr.get(i + k - 1) - arr.get(i);
            result = Integer.min(result, temp);
        }
        return result;
    }
}
