package iteration;

import java.util.LinkedHashMap;
import java.util.Map;

public class Entry1 {
    public static void main(String[] args) {

    }
    public static void iteration() {
        Map<Integer,Character> map = new LinkedHashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        map.put(4,'d');
        map.put(5,'e');
        map.put(6,'f');
        map.put(7,'g');
        map.put(8,'h');
        map.put(9,'i');
        map.put(10,'j');
        System.out.println(map);
        for (Map.Entry<Integer,Character> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
