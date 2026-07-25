package treemap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        map.put(8, 8);
        map.put(9, 9);
        map.put(10, 10);
        map.put(11, 11);
        map.put(12, 12);
        map.put(13, 13);
        for (int i = 1; i < map.size(); i++) {
            if (map.get(i) % 2 == 0) {
                map.put(i, i % 2);
                System.out.println("successfully done ");
            }
        }

    }
}

