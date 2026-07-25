package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate4 {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(11, 22, 33, 44, 55,11,22,33,44,123,21,17,9,8,7,6,5,12,23,45,6,7,8);
        Predicate<Integer> predicate=i->i>10;
        Predicate<Integer> predicate2=i->i<100;
        List<Integer> list2=list.stream().filter(predicate).filter(predicate2).distinct().sorted().toList();
        System.out.println(list2);
    }
}
