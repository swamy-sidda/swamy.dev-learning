package treemap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;
public class TreeMap5
{
    public static void main(String da[])
    {
        TreeMap<Integer,String> m1=new TreeMap<>();
        int count=1;
        String[] a={"k","ss","we","k","k","ss","we","k","k","ss","we","k"};
        for(int i=0;i<a.length;i++)
        {
            m1.put(count++,a[i]);
        }
        System.out.println(m1);
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.putAll(m1);
        System.out.println(tm);
// tm.putAll(m);
    }
}

class MyCompare implements Comparator<Integer>
{
    Map<Integer,String> map;
    MyCompare(Map<Integer,String> map)
    {
        this.map=map;
    }
    public int compare(Integer n1,Integer n2)
    {
        int res= map.get(n1).compareTo(map.get(n2));
        if(res==0) return 1;
        else return res;
    }

}
