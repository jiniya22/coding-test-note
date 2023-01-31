package codility.lesson4;

import java.util.Arrays;

public class MissingIntegerExample {
    public static void main(String[] args) {
//        System.out.println(missingInteger(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(missingInteger(new int[]{1, 3}));        // 2
        System.out.println(missingInteger(new int[]{1, 2, 2, 3}));      // 4
        System.out.println(missingInteger(new int[]{-100, 4, -23, 1, -11, 3, 11})); // 2
        System.out.println(missingInteger(new int[]{-1, -3}));      // 1
        System.out.println(missingInteger(new int[]{2}));   // 1
        System.out.println(missingInteger(new int[]{-100, 4, 19, 5, 91, 8, 22, 6})); //1
    }

    static int missingInteger2(int[] A) {
        int result = 1;
        for (int a : A) {
            if(a < 0)
                continue;
            if(result < a)
                break;
            result = a + 1;
        }
        return result;
    }

    static int missingInteger(int[] A) {
        Arrays.sort(A);
        int result = 1;
        for (int a : A) {
            if(a < 0)
                continue;
            if(result < a)
                break;
            result = a + 1;
        }
        return result;
    }


}
