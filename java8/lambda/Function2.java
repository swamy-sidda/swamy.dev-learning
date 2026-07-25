package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function2 {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Predicate<Integer> predicate=i->i%2==0;
        Function<Integer,Integer> function=i->i*i;
        for(int i=0;i<list.size();i++){
            if(predicate.test(list.get(i))){
                System.out.println(function.apply(list.get(i)));
            }
        }
    }
}
