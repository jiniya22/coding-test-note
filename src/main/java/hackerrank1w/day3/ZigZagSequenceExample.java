package hackerrank1w.day3;

import java.util.Arrays;

public class ZigZagSequenceExample {
    public static void main(String[] args) {
//        findZigZagSequence(new int[]{2, 3, 5, 1, 4}, 5);
        findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 7);
    }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int startIdx = n / 2, endIdx = a.length - 1;
        swap(a, startIdx++, endIdx--);
        while (startIdx < endIdx) {
            swap(a, startIdx++, endIdx--);
        }
        System.out.println(arrayToString(a));
    }

    static void swap(int[] a, int pos1, int pos2) {
        int temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }

    static String arrayToString(int[] a) {
        if (a == null || a.length == 0)
            return "";
        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == a.length - 1)
                return b.toString();
            b.append(" ");
        }
    }

//    static String join(int[] arr) {
//        return Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
//    }
}
