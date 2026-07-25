package java8.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {
     static void main(String[] sd)
    {
        String str="kumarswamysiddarapu";
        str.chars().mapToObj(e->(char)e).distinct().forEach(System.out::println);

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().collect(Collectors.partitioningBy(e->e%2==0)).
                entrySet().stream().forEach(System.out::println);

    }
}
