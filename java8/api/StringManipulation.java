package java8.api;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringManipulation {
     static void main(String[] dj){
      //  manipulation();
        reverse();
    }
    public static void manipulation(){

        Predicate<String> length=str1->str1.length()>10;
        Function<String,Integer> length2=str1->str1.length()*str1.length();
        List<String> list= Arrays.asList("kumarswamysiddarapu","swamynadan","samaya","manan");
        list.stream().filter(length).map(length2).forEach(System.out::println);
    }
    public static void reverse(){
        List<String> list=Arrays.asList("kumar","samay","madan","siddarapu","manan");
        List<String> list1=list.stream().sorted(Comparator.reverseOrder()).toList();
        list1.forEach(System.out::println);
    }
}
