package hackerrank.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortExample {
    public static void main(String[] args) {
        countSwaps(new ArrayList<>(List.of(6, 4, 1)));
    }

    public static void countSwaps(List<Integer> a) {
        int cnt = 0;
        for(int i = 0; i < a.size() - 1; i++) {
            for(int j = 1; j < a.size() - i; j++) {
                if(a.get(j) < a.get(j - 1)) {
                    swap(a, j, j - 1);
                    cnt++;
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.%n", cnt);
        System.out.printf("First Element: %d%n", a.get(0));
        System.out.printf("Last Element: %d%n", a.get(a.size() - 1));
    }

    static void swap(List<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

}
