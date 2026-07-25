package stack;
import queue.Node;
public class Stack_Implementation1
{
    private int count=0;
    private Node first=null;
    public void push(Object e)
    {
        if(first==null)
        {
            first=new Node(e);
            count++;
            return;
        }
        Node key=first;
        first=new Node(e);
        first.next=key;
        count++;
    }
    public Object pop()
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
    public boolean isEmpty()
    {
        return size()==0;
    }
    public String toString()
    {
        if(size()==0) return "[]";
        Node curr=first;
        String s="["+curr.ele;
        while(curr.next!=null)
        {
            curr=curr.next;
            s+=","+curr.ele;
        }
        s+="]";
        return s;
    }
    public void clear()
    {
        first=null;
        count=0;
    }
}