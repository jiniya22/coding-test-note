package hackerrank.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNoteExample {
    public static void main(String[] args) {
        checkMagazine(List.of("attack", "at", "dawn"), List.of("Attack", "at", "dawn"));    // No
        checkMagazine(List.of("give", "me", "one", "grand", "today", "night"),
                List.of("give", "one", "grand", "today"));  // Yes
        checkMagazine(List.of("two", "times", "three", "is", "not", "four"),
                List.of("two", "times", "two", "is", "four"));  // No
    }

    static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (String s : magazine) {
            map1.compute(s, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        for (String s : note) {
            map2.compute(s, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (!map1.containsKey(entry.getKey())) {
                System.out.println("No");
                return;
            } else if (map1.get(entry.getKey()) < entry.getValue()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
