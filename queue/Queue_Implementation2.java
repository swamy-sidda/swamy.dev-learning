package queue;

public class Queue_Implementation2
{
    Object[] arr;
    private int count=0;
    public Queue_Implementation2()
    {
        arr=new Object[6];
    }
    public void add(Object e)
    {
        if(count>=size())
        {
            Object[] arr1=new Object[(size()*3/2)+1];
            for(int i=0;i<count;i++)
            {
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
        arr[count++]=e;
    }
    public Object poll()
    {
        if(size()==1)
        {
            Object key=arr[0];
            arr=null;
            count--;
            return key;
        }
        Object key=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[++i];
        }
        count--;
        return key;
    }
    public int size()
    {
        return count;
    }
    public String toString()
    {
        if(size()==0) return "[]";
        String s="[";
        for(int i=0;i<size();i++)
        {
            s+=arr[i];
        }
        s+="]";
        return s;
    }
    public Object peek()
    {
        return arr[0];
    }
}