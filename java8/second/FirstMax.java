package java8.second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstMax {
     static void main(String[] as){
        List<Integer> list = Arrays.asList(1);
        max(list);
    }
    public static void max(List<Integer> list){
       int i= list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }
}
