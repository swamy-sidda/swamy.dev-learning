package treemap;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class TreeMap7_Values
{
    public static void main(String as[])
    {
        TreeMap<Object,Object> t=new TreeMap<>();
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
        TreeMap t1=t;

        Collection value=t.values();
        for(Object s:value)
        {
            System.out.println(s);
        }
        System.out.println(t.equals(t1));
        Set key=t.keySet();
        for(Object k:key)
        {
            System.out.println(k);
        }
        for(Map.Entry<Object,Object> m:t.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}