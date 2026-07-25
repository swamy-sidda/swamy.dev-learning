package java8.api;

import java.util.Arrays;
import java.util.List;

public class Asmnt1 {
     static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(i->i>0).forEach(i->System.out.println(i));
        list.stream().filter(i->i>0).forEach(System.out::println);
        long n=list.stream().count();
        System.out.println("count is"+n);
        List<String> list1 = Arrays.asList("komali","kumar","kamali","manan","samay","karan","String");
        System.out.println(list1);
        list1.stream().distinct().forEach(System.out::println);
        //question 3
        List list2=list1.stream().filter(i->i.charAt(0)=='k').distinct().sorted().toList();
        System.out.println("list Of matched elements "+list2);
    }
}
