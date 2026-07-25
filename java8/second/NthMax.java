package java8.second;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NthMax {
     static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,61,71,81,19,1);
        max(list,3);
    }
    public static void max(List<Integer> list,int n){
        Integer max=list.stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get();
        System.out.println(max);
    }
}
