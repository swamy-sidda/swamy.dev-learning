package java8.second;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StringMap {
     static void main(String[] args) {
        List<String> list1= Arrays.asList("a","b","c","d");
        List<String> list2= Arrays.asList("aa","bb","cc","dd");
        List<String> list3= Arrays.asList("aaa","bbb","ccc","ddd");

        List<List<String>> list= Arrays.asList(list1,list2,list3);
       list.stream().flatMap((s)->s.stream()).map(e->String.valueOf(e)).collect(Collectors.groupingBy
       (e->e.charAt(0),()->new TreeMap<Character,List<String>>(),Collectors.toList())).forEach((k,
         v)-> System.out.println(k+" "+v));
    }
}
