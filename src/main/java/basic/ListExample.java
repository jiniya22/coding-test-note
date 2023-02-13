package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        listExample1();
    }

    static void listExample1() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new LinkedList<>(List.of(6, 7, 8, 9));
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
    }
}
