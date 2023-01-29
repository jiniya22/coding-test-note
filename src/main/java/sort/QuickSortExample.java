package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] a1 = new int[]{4, 11, 678, 22, 1, 8, 12};
        quickSort(a1, 0, a1.length - 1);
        System.out.println(Arrays.toString(a1));
        System.out.println(quickSort2(List.of('z', 'b', 't', 'a', 'f')));
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right)  return;

        int pivot = arr[right];
        int sortedIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, sortedIndex);
                sortedIndex++;
            }
        }
        swap(arr, sortedIndex, right);
        quickSort(arr, left, sortedIndex - 1);
        quickSort(arr, sortedIndex + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    static List<Character> quickSort2(List<Character> arr) {
        if (arr == null || arr.size() < 2) return arr;
        List<Character> left = new ArrayList<>(), right = new ArrayList<>();
        char pivot = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            char ele = arr.get(i);
            if (ele < pivot) {
                left.add(ele);
            } else {
                right.add(ele);
            }
        }
        List<Character> result = new ArrayList<>(quickSort2(left));
        result.add(pivot);
        result.addAll(quickSort2(right));
        return result;
    }
}
