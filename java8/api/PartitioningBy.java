package java8.api;
import java.lang.Character;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningBy {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,4,5,6,7,8,9,10);
        list.stream().collect(Collectors.partitioningBy(x->x%2==0)).entrySet()
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");
        List<String> str=Arrays.asList("a","b","c","kumar","karan","NMVG JF");
       str.stream().filter(e->!e.endsWith("a")||!e.endsWith("a")||!e.endsWith("i")||!e.endsWith("o")||
       !e.endsWith("o")).collect(Collectors.joining()).chars().mapToObj(e->(char)e).
       filter(e->e=='a'||e=='e'||e=='i'||e=='o'||e=='u').collect(Collectors.groupingBy(e->e,
       Collectors.counting())).entrySet().stream().forEach(System.out::println);}
}
