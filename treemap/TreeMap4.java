package treemap;

import java.util.TreeMap;
import java.util.Comparator;
public class TreeMap4
{
    public static void main(String da[])
    {
        TreeMap<Integer,Integer> m=new TreeMap<>();
        int count=1;
        int[] a={1,21,23,12,13,14,15,16,43,12,14,16,12};
        for(int i=0;i<a.length;i++)
        {
            m.put(count++,a[i]);
        }
        System.out.println(m);
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        tm.putAll(m);
        System.out.println(tm);
// tm.putAll(m);
    }
}

class MiCompare implements Comparator<Integer>
{
    TreeMap<Integer, String> map1;
    MiCompare(TreeMap<Integer, String> map1)
    {
        this.map1=map1;
    }
    public int compare(Integer n1,Integer n2)
    {
        int res= map1.get(n1).compareTo(map1.get(n2));
        if(res==0) return 1;
        else return res;
    }

}
