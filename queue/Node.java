package queue;

public class Node
{
   public  Object ele;
  public   Node next;
    public Node(Object e)
    {
        this.ele=e;
        this.next=null;
    }
    public Node(Object e,Node n)
    {
        this.ele=e;
        this.next=n;
    }
    public Node(){
        this.ele=null;
        this.next=null;
    }

}