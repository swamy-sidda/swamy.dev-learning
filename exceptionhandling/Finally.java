package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Finally {
     static void main(String[] args) {
       test();
    }
    public static void test() throws NullPointerException {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(null);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
