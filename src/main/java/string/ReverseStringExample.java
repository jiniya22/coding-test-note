package string;

import util.CommonUtils;

public class ReverseStringExample {
    public static void main(String[] args) {
        String s = "i love programming very much";
        long startTime = System.nanoTime();
        System.out.println(reverseString(s));
        CommonUtils.displayExecutionTime(System.nanoTime() - startTime);    // 169334 ns

        startTime = System.nanoTime();
        System.out.println(reverseString2(s));
        CommonUtils.displayExecutionTime(System.nanoTime() - startTime);    // 35542 ns
    }

    static String reverseString(String s) {
        if(s.isBlank())
            return s;
        char[] arr = s.toCharArray();
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return new String(arr);
    }

    /**
     * 배열을 이용하여 바꾸는 것보다 더 성능이 좋습니다.
     * 권장!
     * @param s
     * @return
     */
    static String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
