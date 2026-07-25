package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate3 {
     static void main(String[] args) {
        List<String> list= Arrays.asList("kumar swamy","samay","santhosh","reddy","ramana","varma");
        Predicate<String> predicate=s->s.length()>5;
        Predicate<String> predicate2=s->!s.contains(" ");
        List<String> list2=list.stream().filter(predicate).filter(predicate2).toList();
        System.out.println(list2);
    }
}
