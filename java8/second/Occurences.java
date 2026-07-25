package java8.second;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurences {
     static void main(String[] args) {
        String s= "kodandapani";
        counts(s);
    }
    public static void counts(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        for (Map.Entry<Character, Long> entry : map.entrySet()) {
//            System.out.print(entry.getKey() + " : " + entry.getValue() + " \n");

            Map<Character, Long> ma = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                    i -> i, Collectors.counting()));
            for (Map.Entry<Character, Long> ma2 : ma.entrySet()) {
                System.out.println(ma2.getKey() + " : " + ma2.getValue());
            }
        }
    }


