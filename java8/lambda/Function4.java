package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function4 {
     static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9);
        Predicate<Integer> isEven = i->i%2==0;
        Function<Integer,Integer> function = i->i*10;
        for(int i=0;i<list.size();i++){
            if(isEven.test(list.get(i))){
             int element=function.apply(list.get(i));
             list.set(i,element);
            }
        }
        System.out.println(list);
    }
}
