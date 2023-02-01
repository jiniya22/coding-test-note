package programmers.lv1.hash;

import java.util.HashMap;
import java.util.Map;

public class HashExample {
    public static void main(String[] args) {

    }

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (String s : participant) {
            map1.compute(s, (key, oldValue) -> oldValue == null ? 0 : oldValue + 1);
        }
        for (String s : completion) {
            map2.compute(s, (key, oldValue) -> oldValue == null ? 0 : oldValue + 1);
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (!map2.keySet().contains(entry.getKey())
            || entry.getValue() > map2.get(entry.getKey())) {
               return entry.getKey();
            }
        }

        return "";
    }
}
