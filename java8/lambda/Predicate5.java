package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate5 {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0);
        Predicate<Integer> predicate=i->i%2==0;
        Predicate<Integer> predicate2=predicate.negate();
        List<Integer> l1=list.stream().filter(predicate2).sorted().distinct().toList();
        System.out.println(l1);

    }
}
