package java8.api;


import java.util.*;
import java.util.stream.Collectors;

public class Statistics {
     static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,4,5,6,7,8,9,10);
       int sum= list.stream().filter(e->e!=null).mapToInt(e->e).sum();
       System.out.println(sum);
      int sum1= list.stream().reduce(0,(a,b)->a+b);
      System.out.println(sum1);
        DoubleSummaryStatistics result=list.stream().mapToDouble(e->e).summaryStatistics();
        System.out.println("result of average is "+result.getAverage());
        System.out.println("result of maximum is "+result.getMax());
        System.out.println("result of minimum is "+result.getMin());
        System.out.println("result of sum is "+result.getSum());
        System.out.println("result of count is "+result.getCount());
        System.out.println("next");


        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list2= Arrays.asList(8);
         list1.stream().collect(Collectors.groupingBy(e->e));

        list1.stream().mapToInt(e->e).map(e->list2.get(0)*e);

        



    }
}
