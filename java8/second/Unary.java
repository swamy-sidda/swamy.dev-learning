package java8.second;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Unary {
     static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(3));
       // UnaryOperator is for getting same datatype value which we sent to the method apply.
       //Function interface can accept different type of  generics not same.
        UnaryOperator<Integer> operator = i->i*i;
        System.out.println(operator.apply(3));
    }
}

