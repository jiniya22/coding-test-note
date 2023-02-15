package string;

import util.CommonUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 중복 문자 제거하기
 */
public class RemoveDuplicateCharactersExample {

    public static void main(String[] args) {
        String s = "aB 8 b tT ! k 2 098!";

        long startTimeV1 = System.nanoTime();
        String resultV1 = removeDuplicates1(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println(resultV1);

        System.out.println();
        long startTimeV2 = System.nanoTime();
        String resultV2 = removeDuplicates2(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println(resultV2);

        System.out.println();
        long startTimeV3 = System.nanoTime();
        String resultV3 = removeDuplicates3(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV3);
        System.out.println(resultV3);
    }

    static String removeDuplicates1(String s) {
        if (s.isBlank()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String removeDuplicates2(String s) {
        if (s.isBlank()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String removeDuplicates3(String s) {
        if (s.isBlank()) {
            return s;
        }
        return Arrays.asList(s.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}