package treemap;//import java.util.Map;
import java.util.TreeMap;

public class TreeMap1
{
    public static void main(String ad[])
    {
        TreeMap m=new TreeMap();
        m.put(1,"aa");
        m.put(2,"bb");
        m.put(3,"cc");
        m.put(4,"dd");
        m.put(5,"ee");
        m.put(6,"ff");
        m.put(7,"gg");
        m.put(8,"ff");
        System.out.println(m);
        System.out.println(m.get(3)+"the 3 key value");
        System.out.println(m.containsKey(2)+"2nd key");
        System.out.println(m.containsValue("ff")+"the key");
        System.out.println(m.floorKey(5));
        System.out.println(m.higherKey(2));
        System.out.println(m.get(m.firstKey()));
        System.out.println(m.get(m.lastKey()));
        System.out.println("----------------");
        m.remove(1);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        m.clear();
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}