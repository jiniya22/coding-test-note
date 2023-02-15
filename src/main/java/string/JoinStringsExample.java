package string;

import util.CommonUtils;

import java.util.StringJoiner;

/**
 * 여러 문자열 합치기
 */
public class JoinStringsExample {

    private static final String TEXT_1 = "APple";
    private static final String TEXT_2 = "Banana";
    private static final String TEXT_3 = "Grape";
    private static final String TEXT_4 = "melon";
    private static final String TEXT_5 = "Kiwi";

    public static void main(String[] args) {

        long startTimeV1 = System.nanoTime();
        String stringV1 = String.join(" ", TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("String: " + stringV1);
        System.out.println();

        long startTimeV4 = System.nanoTime();
        String stringV4 = joinByDelimiter(' ', TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV4);
        System.out.println("String: " + stringV4);
    }

    static String joinByDelimiter(char delimiter, String... args) {
        if (args == null || args.length == 0) {
            return "";
        }

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
        for (String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }
    
}
