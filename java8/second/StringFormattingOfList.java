package java8.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFormattingOfList {
     static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","cat","drum","equal",
                "fine","good","happy","intelligent","justice","king");
        String str=list.stream().reduce("",(a,b)->a+" "+b);
        System.out.println(str);

        String string=list.stream().collect(Collectors.joining(" "));
        System.out.println(string);

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        String str1=list1.stream().map(e->e*e).toList().stream().map(e->String.valueOf(e)).
         reduce("",(a,b)->a+" "+b);
        System.out.println(str1);
    }
}
