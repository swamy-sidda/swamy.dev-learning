package java8.api;

import java.util.Arrays;
import java.util.List;

public class EvenCube {
     static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List list1 =list.stream().filter(i->i%2==0).map(i->i*i*i).toList();
        System.out.println(list1);
        list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
        list.stream().filter(i->i/10==0).forEach(System.out::println);
    }
}
