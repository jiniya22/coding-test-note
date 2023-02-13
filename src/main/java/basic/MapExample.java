package basic;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        mapExample();
        hashTableExample();
    }

    static void mapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(null, "banana");
        map.put(5, null);
        System.out.println(map);
    }

    static void hashTableExample() {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "apple");
        map.put(null, "banana");
//        map.put(5, null);
        System.out.println(map);

    }
}
