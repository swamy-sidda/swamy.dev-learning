package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function3 {
     static void main(String[] args) {
        List<String> list = Arrays.asList("kumar","swamy","vamsi","samay");
        Function<String,Integer> function = i->i.length();
        for(int i=0;i<list.size();i++){
            System.out.println(function.apply(list.get(i)));
        }
    }
}
