package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Finally1 {
     static void main(String[] args) {
         test1();
    }
    public static void test1()  {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(null);
        int sum=0;
        try {
            System.out.print(new String(""));
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
                sum+=list.get(j);
            }
        }catch (NullPointerException e){
            throw e;
        }
        finally {
            System.out.println("kumarswamy");
            // throw new InstantiationError("kumar swamy");
        }
    }
}
