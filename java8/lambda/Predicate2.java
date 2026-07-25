package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Predicate2 {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,9,12,13,1,4,15,14,122,233,34,44);
        System.out.println(list);
        Predicate<Integer> predicate=i->i%2==0;
        List<Integer> l2=list.stream().filter(predicate).distinct().sorted().toList();
        System.out.println(l2);
    }
}
