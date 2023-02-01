package hackerrank.string;

import java.util.*;

/**
 * Counter Map
 */
public class SherlockAndTheValidStringExample {
    public static void main(String[] args) {
//        System.out.println(isValid("abc"));    // YES
//        System.out.println(isValid("abcc"));    // YES
//        System.out.println(isValid("aabbcd")); // NO
//        System.out.println(isValid("aabbccddeefghi")); // NO
        System.out.println(isValid("abcdefghhgfedecba")); // YES
//        System.out.println(isValid("abbac"));   // YES
//        System.out.println(isValid("aaaaabc"));

    }

    static String isValid(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charMap.compute(ch, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        Map<Integer, Integer> frequenceMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            frequenceMap.compute(entry.getValue(), (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        if(frequenceMap.size() == 1)
            return "YES";
        if(frequenceMap.size() > 2)
            return "NO";

        int maxFrequence = Collections.max(frequenceMap.keySet());
        int minFrequence = Collections.min(frequenceMap.keySet());
        if(minFrequence == 1 && frequenceMap.get(minFrequence) == 1)
            return "YES";
        if(maxFrequence - minFrequence == 1 && frequenceMap.get(maxFrequence) == 1)
            return "YES";

        return "NO";
    }
}
