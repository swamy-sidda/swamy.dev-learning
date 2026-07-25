package linkedlist;

public class MyLinkedList {
 int count=0;
 Nod head=null;
 Nod tail=null;

    public void add(int ele)
    {
        Nod n = new Nod(ele, null);

        if(head == null)
        {
            head = tail = n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }

        count++;
    }
public void add(int index,int ele)
{
 if(index==0)
 {
  Nod n=new Nod(ele,head);
  head=n;
  count++;
  return;
 }
 Nod curr=head;
 for(int i=1;i<index;i++)
 {
   curr=curr.next;
 }
 Nod n=new Nod(ele,curr.next.next);
 curr.next=n;
 count++;
}
public String toString()
{
    StringBuilder sb=new StringBuilder();
    Nod curr=head;
    while(curr!=null)
    {
        sb.append(curr.ele+" ");
        curr=curr.next;
    }
    return sb.toString();
}
}