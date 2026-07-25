package linkedlist;

class LinkedList_Implementation2
{
 public static void main(String saf[])
 {
  Node1 head=null;
     Node1 last = null;
     head=new Node1(10, last, null);
  head.next=new Node1(20, last, null);
  head.next.next=new Node1(30, last, null);
  head.next.next.next=new Node1(40, last, null);
  
  Node1 curr=head;
  while(curr!=null)
  {
    System.out.println(curr.ele);
    curr=curr.next;
  }
 }
}