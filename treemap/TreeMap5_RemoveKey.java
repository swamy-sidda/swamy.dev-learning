package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap5_RemoveKey
{
    public static void main(String as[])
    {
        TreeMap<Integer,Character> m=new TreeMap<>();
        m.put(1,'s');
        m.put(11,'r');
        m.put(12,'g');
        m.put(13,'h');
        m.put(13,'d');
        m.put(15,'d');
        m.put(17,'s');
        m.put(17,'v');
        System.out.println(m);
        TreeMap<Integer,Character> m1=new TreeMap<>();
        m1.put(1,'s');
        m1.put(11,'r');
        m1.put(12,'g');
        m1.put(13,'h');
        m1.put(13,'d');
        m1.put(15,'d');
        m1.put(17,'s');
        m1.put(17,'v');

//@@ Removing the key element from the maP
        System.out.println(m1);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a key value to delete keys");
        int key=sc.nextInt();
        System.out.println(m);
        if(m1.containsKey(key)) m.remove(key);
        System.out.println(m1);
        System.out.println(m);

    }
}
