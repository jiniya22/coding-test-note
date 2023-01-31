package hackerrank.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열로 하는 거는 CyclicRotationExample
 */
public class LeftRotationExample {
    public static void main(String[] args) {
        System.out.println(rotLeft(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 4));
        System.out.println(rotRight(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 2));
        System.out.println(rotRight(new ArrayList<>(List.of(1, 2, 3, 4)), 4));
        System.out.println(rotRight(new ArrayList<>(List.of(1, 2, 3, 4)), 3));

        System.out.println(rotRight(new ArrayList<>(List.of(3, 8, 9, 7, 6)), 0));
        System.out.println(rotRight(new ArrayList<>(List.of(3, 8, 9, 7, 6)), 1));
        System.out.println(rotRight(new ArrayList<>(List.of(3, 8, 9, 7, 6)), 2));
        System.out.println(rotRight(new ArrayList<>(List.of(3, 8, 9, 7, 6)), 3));

    }

    static List<Integer> rotLeft(List<Integer> a, int d) {
        if(d == a.size()) return a;
        List<Integer> result = new ArrayList<>();
        d %= a.size();

        for (int i = d; i < a.size(); i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < d; i++) {
            result.add(a.get(i));
        }
        return result;
    }

    static List<Integer> rotRight(List<Integer> a, int d) {
        List<Integer> result = new ArrayList<>();
        d %= a.size();

        for (int i = a.size() - d; i < a.size(); i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < a.size() - d; i++) {
            result.add(a.get(i));
        }
        return result;
    }
}
