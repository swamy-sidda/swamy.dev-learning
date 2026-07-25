package java8.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nth_Element {
     static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        print(list,3);
    }
    public static void print(List<Integer> list,int n){
        Integer min= list.stream().sorted().skip(n-1).findFirst().orElse(0);
        System.out.println(min);
    }
}
