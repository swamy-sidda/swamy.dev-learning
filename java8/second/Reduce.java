package java8.second;

import java.util.*;

public class Reduce {
    static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,34,45,56,67,78,89,9,34);
        Optional<Integer> option =list.stream().reduce((a, b)->a>b?a:b);
       // System.out.println("maximum value is "+option);
        if(option.isPresent()){
            System.out.println("maximum value is "+option.get());
        }
        else{
            System.out.println("maximum value is null");
        }

        Optional<Integer> op=  list.stream().distinct().reduce((a,b)->a<b?a:b);
        //System.out.println("minimum value is "+op);
        if(op.isPresent()){
            System.out.println("maximum value is "+op.get());
        }
        else{
            System.out.println("maximum value is null");
        }

     String name="kavitha";
      String n=  name.chars().mapToObj(e->(char)e).sorted().map(String::valueOf).
              reduce("",(a, b)->a+" "+b);
        System.out.println(n);

        String reverse=name.chars().mapToObj(e->(char)e).sorted(Comparator.reverseOrder()).
                map(e->String.valueOf(e)).reduce("",(a, b)->a+" "+b);
        System.out.println(reverse);


    }
}
