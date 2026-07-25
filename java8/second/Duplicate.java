package java8.second;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
     static void main(String[] args) {
     print();
    }
    public static void print(){
        Set<Character> set=new HashSet<>();
        String str="malayalam";
        str.chars().filter(w->!set.add((char) w)).forEach(e->System.out.println((char)e));
        System.out.println("--------------------");
       // Map<Character,Integer> map=new LinkedHashMap<>();
        str.chars().mapToObj(e->(char)e).
                collect(Collectors.
                        groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().
                filter(e->e.getValue()==1).
                forEach(System.out::println);
       // System.out.println(map);
    }

}
