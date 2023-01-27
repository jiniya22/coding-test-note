package hackerrank1w.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyIntegerExample {

    public static void main(String[] args) {
        System.out.println(lonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
        System.out.println(lonelyInteger(List.of(1, 5, 2, 4, 3, 4, 3, 2, 1)));
    }

    static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        a.forEach(i -> {
            if(map.containsKey(i))
                map.remove(i);
            else
                map.put(i, 1);
        });
        return map.keySet().stream().findFirst().orElse(0);
    }
}
