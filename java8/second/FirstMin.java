package java8.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstMin {
     static void main(String[] args){
      List<Integer> list= Arrays.asList(19,12,13,14,15,16,17,18,19,10);
      print(list);
    }
    public static void print(List<Integer> list){
      Integer min= list.stream().sorted().findFirst().get();
      System.out.println(min);
    }
}
