package string;

import util.CommonUtils;

public class ReverseWordsExample {
    private static final String WHITE_SPACE = " ";

    public static void main(String[] args) {
        String s = "I AM A GEEK. APPLE BANANA,";
        long startTime = System.nanoTime();
        System.out.println(reverseWords1(s));
        CommonUtils.displayExecutionTime(System.nanoTime() - startTime);

        String s2 = "2 AM A GEEK. APPLE BANANA,";
        startTime = System.nanoTime();
        System.out.println(reverseWords2(s2));
        CommonUtils.displayExecutionTime(System.nanoTime() - startTime);
    }

    /**
     * 단어단위로 reverse, 단어의 순서는 그대로
     * @param s
     * @return
     */
    static String reverseWords1(String s) { // 161417
        if(s.isBlank())
            return s;
        String[] arr = s.split(WHITE_SPACE);
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i > 0; i--) {
            sb.append(arr[i]).append(WHITE_SPACE);
        }
        sb.append(arr[0]);
        return sb.toString();
    }

    /**
     *
     * @param s
     * @return
     */
    static String reverseWords2(String s) {
        if(s.isBlank())
            return s;
        StringBuilder sb = new StringBuilder();
        for (String word : s.split(WHITE_SPACE)) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(WHITE_SPACE);
        }
        String result = sb.toString();
        return result.substring(0, result.length() - 1);
    }
}
