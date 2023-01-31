package codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheckExample {
    public static void main(String[] args) {
        System.out.println(permCheck(new int[]{4, 1, 3, 2}));
        System.out.println(permCheck(new int[]{4, 1, 3}));
    }

    static int permCheck(int[] A) {
        int result = 1;
        Set<Integer> s = new HashSet<>();
        for (int a : A) {
            if(a > A.length || s.contains(a)) {
                result = 0;
                break;
            }
            s.add(a);
        }
        return result;
    }
}
