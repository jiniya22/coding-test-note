package hackerrank.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoStringsExample {
    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world")); // YES
        System.out.println(twoStrings("hi", "world")); // NO
    }

    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map1.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        for (char ch : s2.toCharArray()) {
            map2.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        return map1.keySet().stream().anyMatch(f -> map2.keySet().contains(f)) ? "YES" : "NO";
    }
}
