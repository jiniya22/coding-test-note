package string;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterExample {
    private static final int MAX_CODE = 65535;

    public static void main(String[] args) {
//        System.out.println("\n:: isUnique1 ::");
//        System.out.println(isUnique1("m el on"));
//        System.out.println(isUnique1("a9b7d2"));
//        System.out.println(isUnique1("가나다"));
//
//        System.out.println(isUnique1("apple"));
//        System.out.println(isUnique1("a9a7d2"));
//        System.out.println(isUnique1("가나다가"));
//
        System.out.println("\n:: isUnique2 ::");

        System.out.println(isUnique2("apple"));

        System.out.println(isUnique2("abc3"));

    }

    /**
     * 0 ~ 65535 사이의 아스키 및 유니코드 문자를 포함하는 문자열이 있습니다.<br>
     * 이 문자열이 각각 unique한 문자만 포함하고 있을 경우 true를 반환하는 코드를 작성하세요.<br>
     * 단, 공백은 무시하세요
     * @param str
     * @return
     */
    static boolean isUnique1(String str) {
        Map<Character, Boolean> chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) <= MAX_CODE) {
                char ch = str.charAt(i);
                if (!Character.isWhitespace(ch)) {
                    if (chars.put(ch, true) != null) {
                        return false;
                    }
                }
            } else {
                System.out.println("65535 범위를 넘어선 문자입니다");
                return false;
            }
        }
        return true;
    }

    /**
     * 97 ~ 122
     * @param str
     * @return
     */
    static boolean isUnique2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) < 97 || str.codePointAt(i) > 122) {
                System.out.println("a-z 범위를 넘어선 문자입니다");
                return false;
            }
        }
        return true;
    }
}
