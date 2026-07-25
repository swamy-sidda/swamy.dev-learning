package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function5 {
     static void main(String[] args) {
        List<String> list = Arrays.asList("kumar","swamy","kiran","samay");
        Predicate<String> isEven = s -> s.contains("k");
        Function<String,Character>  function = s -> s.charAt(0);
        for(String s: list){
            if(isEven.test(s)){
                System.out.println(s+" "+function.apply(s));
            }
        }
    }
}
