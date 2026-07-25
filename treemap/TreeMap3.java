package treemap;

import java.util.TreeMap;
class TreeMap3
{
    public static void main(String da[])
    {
        TreeMap<Character,Integer> m=new TreeMap<>();
        char[] a="kumarswamy".toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(!m.containsKey(a[i])) m.put(a[i],1);
            else  m.put(a[i],m.get(a[i])+1);
        }
        System.out.println(m);
    }
}