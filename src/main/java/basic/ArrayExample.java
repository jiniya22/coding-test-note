package basic;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr1, 10);
        int[] arr3 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
