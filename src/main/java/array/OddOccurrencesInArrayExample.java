package array;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArrayExample {
    public static void main(String[] args) {
        System.out.println(oddOccurrencesInArray(new int[]{9, 6, 9, 6, 9, 7, 9, 7}));
    }

    static int oddOccurrencesInArray(int[] A) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
