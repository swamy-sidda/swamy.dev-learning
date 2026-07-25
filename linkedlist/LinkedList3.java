package linkedlist;

public class LinkedList3
{
  public  static void main(String ar[])
 {
 Node2 head=new Node2(10,null);
 head.next=new Node2(20,null);
 head.next.next=new Node2(30,null);
 head.next.next.next=new Node2(40,null);

  Node2 curr=head;
  while(curr!=null)
  {
    System.out.println(curr.data);
    curr=curr.next;
  }
 }
}