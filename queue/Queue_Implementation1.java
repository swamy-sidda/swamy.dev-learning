package queue;

public class Queue_Implementation1
{
    Node first=null;
    private int count=0;
    public void add(Object e)
    {
        if(first==null)
        {
            first=new Node(e);
            count++;
            return;
        }
        Node curr=first;
        while(curr.next!=null) curr=curr.next;
        curr.next=new Node(e);
        count++;
    }
    public Object poll()
    {
        Object key=first.ele;
        first=first.next;
        count--;
        return key;
    }
    public Object peek()
    {
        return first.ele;
    }
    public int size()
    {
        return count;
    }
    public String toString()
    {
        if(size()==0) return "[]";
        Node curr=first;
        String s="["+curr.ele;
        while(curr.next!=null)
        {
            curr=curr.next;
            s+=curr.ele;
        }
        s+="]";
        return s;
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
    public void clear()
    {
        first=null;
        count=0;
    }
}









