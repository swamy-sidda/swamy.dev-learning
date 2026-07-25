package java8.api;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {
     static void main(String[] args) {
        String  str1="abc";
        System.out.println("original String"+str1);
       String string= str1.chars().mapToObj(e->(char)e).toList().reversed().stream().
               map(e->String.valueOf(e)).collect(Collectors.joining()).toString();
       System.out.println("processed string is "+string);


        LinkedList<Integer> list = new LinkedList<>();
       list.add(10);list.add(20);
       list.add(30);list.add(40);list.add(50);list.add(60);
       list.add(70);list.add(80);list.add(90);list.add(110);
       list.add(120);list.add(130);list.add(140);list.add(150);
       list.add(160);list.add(170);list.add(180);list.add(190);list.add(200);

        System.out.println( list.reversed());
      List<Integer> list2=list.reversed();
        System.out.println(list2);
        System.out.println(list);





    }
}
