package treemap;

import java.util.TreeMap;
import java.util.Scanner;
public class TreeMap2_Roman
{
    public static void main(String ad[])
    {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        t.put(1,"I");
        t.put(4,"IV");
        t.put(5,"V");
        t.put(9,"IX");
        t.put(10,"X");
        t.put(40,"XL");
        t.put(50,"L");
        t.put(90,"XC");
        t.put(100,"C");
        t.put(400,"CD");
        t.put(500,"D");
        t.put(900,"CM");
        t.put(1000,"M");

        System.out.println("result of operation is "+3252%1000);
        System.out.println(t);

        StringBuilder sb=new StringBuilder();
        System.out.println("enter a number to convert as Roman");
        int n=sc.nextInt();

        if(t.containsKey(n))
        {
            System.out.println(t.get(n));
            return;
        }
        while(n>0)
        {
            int key=t.floorKey(n);
            int val=n/key;
            while(val>0){
                sb.append(t.get(key));
                val--;
            }
            n=n%key;
        }
        System.out.println("Roman"+sb.toString());
    }
}