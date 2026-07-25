package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function1 {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Function<Integer,Integer> function1=i->i%3;
        for(int i=0;i<list.size();i++){
            System.out.print(function1.apply(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
