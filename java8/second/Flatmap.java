package java8.second;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Flatmap {
     static void main(String[] args) {
        List<Character> list = Arrays.asList('a','b','c','d','e','f','g','h','a','s','d');
        List<Character> list1 = Arrays.asList('a','b','c','d','e','f','g','h','r','t','y');
        List<List> list2 = Arrays.asList(list,list1);
       List<Character> list3= list2.stream().flatMap(e->e.stream()).sorted().toList();
        System.out.println(list3);

        System.out.println("-----------------------");

        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<List<Integer>> l3=Arrays.asList(l,l1,l2);
        int sum=l3.stream().flatMap(e->e.stream()).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println("-----------------------");

        l3.stream().flatMap(e->e.stream()).collect(Collectors.groupingBy
      (e -> e,()->new LinkedHashMap<Integer,List<Integer>>(), Collectors.toList())).
       forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("-------------------------------");

        String str="aaabbbccccddddd";
         str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e,
         ()->new LinkedHashMap<Character,List<Character>>(),Collectors.toList())).
         forEach((k,v)->System.out.println(k+":"+v));

         List<String> ll=Arrays.asList("kumar","manav","kali","shiva","samay");
         List<String> ll2=Arrays.asList("kumar","manav","shiva","samay");
         List<List<String>> ll3=Arrays.asList(ll,ll2);


         ll3.stream().flatMap(e->e.stream()).collect(Collectors.joining()).chars().
         mapToObj(c->(char)c).filter(e->e=='a'||e=='e'||e=='i'||e=='o'||e=='u').
         collect(Collectors.groupingBy(e->e,()->new LinkedHashMap<Character,List<Character>>(),Collectors.toList()));

    }
}
