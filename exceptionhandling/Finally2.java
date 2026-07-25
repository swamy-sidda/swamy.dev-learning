package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Finally2 {
     static void main(String[] args) {
        System.out.println(test2());
    }
    public static int  test2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        try {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 4) {
                    return list.get(i);
                }
            }
        } catch (Exception e) {
            return list.get(0);
        }


        finally {
            return list.get(1);
        }
    }
}
