package java8.second;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenCollector {
     static void main(String[] args) {
//        Integer[] a={1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78,89,90};
//        int count=0;
//        Predicate<Integer> predicate=i->i%2==1;
//        for(int i=0;i<a.length;i++)
//            {
//              if(predicate.test(a[i])) {
//                  count++;
//                  System.out.println(a[i]);
//              }
//            }
//        System.out.println("number of elements found is "+count);
//        List<Integer> list= Arrays.asList(a);
//        list.stream().filter(i->i%2==1).forEach(System.out::print);
        int[] a={121,12321,1234321,123,123,432234};

        Predicate<Integer> pre=i->{
            char[] arr =String.valueOf(i).toCharArray();
            int n=0,m=arr.length-1;
            while(n<m) {
                if(arr[n]!=arr[m]) return false ;
                n++;
                m--;
                }
            return true;
        };
        for(int i=0;i<a.length;i++) System.out.println(pre.test(a[i]));
    }

}
