package treemap;

import java.util.TreeMap;
import java.util.Scanner;

public class Number_To_String2
{
    public static void main(String fsg[])
    {
        System.out.println("enter a number to convert to String");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(converter(num));
    }
    public static String converter(int n)
    {
        TreeMap<Integer,String> m=new TreeMap<>();
        m.put(1,"one");      m.put(2,"two");
        m.put(3,"three");    m.put(4,"four");
        m.put(5,"five");     m.put(6,"six");
        m.put(7,"seven");    m.put(8,"eight");
        m.put(9,"nine");     m.put(10,"ten");
        m.put(11,"eleven");   m.put(12,"twelve");
        m.put(13,"thirteen");  m.put(14,"fourteen");
        m.put(15,"fifteen");   m.put(16,"sixteen");
        m.put(17,"seventeen");   m.put(18,"eighteen");
        m.put(19,"ninteen");   m.put(20,"twenty");
        m.put(30,"thirty");   m.put(40,"fourty");
        m.put(50,"fifty");   m.put(60,"sixty");
        m.put(70,"seventy");   m.put(80,"eighty");
        m.put(90,"ninty");   m.put(100,"hundred");
        m.put(1000,"thousand");   m.put(100000,"lakhs");
        m.put(10000000,"crore");
        String s="";

        while(n>0){

            if(m.containsKey(n))
            {
                int key=m.floorKey(n);
                s+=" "+m.get(key);
                n=n%key;
            }
            else
            {
                if(n<100)
                {
                    int value=n;
                    int key=n%10;
                    value=value-key;
                    s+=" "+m.get(value);
                    n=n%10;
                    continue;
                }

                int n1=0;
                int key=m.floorKey(n);
                int value=n/key;
                if(value>9){
                    n1=value%10;
                    value=value-n1;
                }
                s+=" "+m.get(value);
                if(n1!=0)
                    s+=" "+m.get(n1);
                s+=" "+m.get(key);
                n=n%key;
            }
        }
        return s;
    }
}


