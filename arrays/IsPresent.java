package arrays;

import java.util.*;

//example of UnsupportedExample
public class IsPresent {
    static void main(String[] args) {
        demo();
    }

    public static void demo() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.add(null);
        list.add(7);
        list.add(null);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(null);
        list.add(11);
        int i = 0;
        Optional<Integer> opt;
        while (i < list.size()) {
            opt = list.get(i).describeConstable();
            if (opt.isPresent()) {
                System.out.println(opt.get());
            }
        }
    }
}
