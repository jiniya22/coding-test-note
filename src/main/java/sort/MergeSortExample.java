package sort;

import java.util.Arrays;

public class MergeSortExample {

    static int[] arr = {10, 6, 1, 9, 5, 2, 55, 91, 32};
    static int[] result = new int[arr.length];

    public static void main(String[] args) {
        mergeSort(0, arr.length - 1);
        System.out.println(Arrays.toString(result));
    }

    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                result[idx++] = arr[l++];
            } else {
                result[idx++] = arr[r++];
            }
        }

        if (mid < l) {
            while (r <= right) {
                result[idx++] = arr[r++];
            }
        } else {
            while (l <= mid) {
                result[idx++] = arr[l++];
            }
        }

        System.out.println();
        for (int i = left; i <= right; i++) {
            arr[i] = result[i];
        }
        System.out.println();
    }
}
