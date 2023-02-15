package string;

import util.CommonUtils;

/**
 * 문자열에서 공백 제거하기
 */
public class RemoveWhitespacesFromStringExample {

    public static void main(String[] args) {
        String s = "  Hi, hhhh 1111 ,,   djdj   99 ";
        long startTime = System.nanoTime();
        String result = removeWhitespaces(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTime);
        System.out.println(result);
    }

    static String removeWhitespaces(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.replaceAll("\\s", "");
    }
}
