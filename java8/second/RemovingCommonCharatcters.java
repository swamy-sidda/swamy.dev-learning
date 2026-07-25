package java8.second;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingCommonCharatcters {
     static void main(String[] args) {
       remove("abcde","abc");
    }
    public static void remove(String s1, String s2) {
        String sb=s1+s2;
       Map<Character,Long> map= sb.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(e -> e,()->new LinkedHashMap<>(),Collectors.counting()));
       for(Character ch:map.keySet()){
           if(map.get(ch)==1){
               System.out.println(ch);
           }
       }

    }
}
