package hackerrank.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceExample {
    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new ArrayList<>(List.of(1, -3, 71, 68, 17))));
        System.out.println(minimumAbsoluteDifference(new ArrayList<>(List.of(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75))));
    }
    static int minimumAbsoluteDifference(List<Integer> arr) {
        int result = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++) {
            int temp = Math.abs(arr.get(i - 1) - arr.get(i));
            if (temp < result) {
                result = temp;
            }
        }
        return result;
    }
}
