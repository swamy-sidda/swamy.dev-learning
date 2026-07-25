package stack;

final class Stack_Implementation2
{
    private int count=0;
    Object arr[];

    Stack_Implementation2()
    {
        arr=new Object[6];
    }
    public void push(Object e)
    {
        if(count>=size())
        {
            Object[] arr1=new Object[(size()*3/2)+1];
            for(int i=0;i<size();i++)
            {
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
        arr[count++]=e;
    }
    public int size()
    {
        //System.out.println(arr.length);
        return count;
    }
    public String toString()
    {
        if(size()==0) return "[]";
        String s="["+arr[size()-1];
        for(int i=size()-2;i>=0;i--)
        {
            s+=","+arr[i];
        }
        s+="]";
        return s;
    }
    public Object pop()
    {
        Object key=arr[size()-1];
        arr[size()-1]=null;
        count--;
        return key;
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
    public Object peek()
    {
        return arr[size()-1];
    }
    public void clear()
    {
        arr=null;
        count=0;
    }
}