package string;

import util.CommonUtils;

/**
 * 첫번째 유니크 문자 찾기
 */
public class FirstNonRepeatedCharacterExample {

    public static void main(String[] args) {
        String s = "Hello Jiniworled HJ  en";
        System.out.println("입력값: " + s);

        long startTimeV1 = System.nanoTime();
        char firstcharV1 = firstNonRepeatedCharacterV1(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Found character: " + firstcharV1);
    }

    static char firstNonRepeatedCharacterV1(String str) {
        if (str == null || str.isBlank()) {
            return Character.MIN_VALUE;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}