package java8.api;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingString {
     static void main(String[] ad){
        String str="kumarswamy";
        String string= str.chars().sorted().mapToObj(e->String.valueOf((char)e)).
        collect(Collectors.joining());
                System.out.println("Default sorted Order is----->"+string);


        String string1=  str.chars().mapToObj(e->String.valueOf((char)e)).sorted(Comparator.
       reverseOrder()).collect(Collectors.joining());
               System.out.println("Reverse Order sorting is----->"+string1);

          System.out.println("finding vowels");

         str.toLowerCase().chars().mapToObj(e->(char)e).filter(e->e=='a'||e=='e'
         ||e=='i'||e=='o'||e=='u').collect(Collectors.groupingBy(Function.identity(),Collectors.
         counting())).forEach((k,v)->{System.out.println(k+"="+v);});
        System.out.println("finding vowels count in list of Strings");

        List<String> list= Arrays.asList("kumar","karan","shivuda","elephant","looloolemon","neeruru");
        list.stream().collect(Collectors.joining()).chars().mapToObj(e->(char)e).filter(e->e=='a'||e=='e'
                ||e=='i'||e=='o'||e=='u').collect(Collectors.groupingBy(Function.identity(),Collectors.
                counting())).forEach((k,v)->{System.out.println(k+"="+v);});

            }
        }


