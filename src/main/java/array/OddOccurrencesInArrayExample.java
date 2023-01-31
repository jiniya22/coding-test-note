package array;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArrayExample {
    public static void main(String[] args) {
        System.out.println(oddOccurrencesInArray(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(oddOccurrencesInArray(new int[]{9, 6, 9, 6, 7, 1}));
    }

    static int oddOccurrencesInArray(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : A) {
            if(map.containsKey(i)) {
                map.remove(i);
            } else {
                map.put(i, 1);
            }
        }
        return map.keySet().stream().findFirst().orElse(0);
    }
}
