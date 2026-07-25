package linkedlist;

public  class Node2
{
  int val;
  Object data;
  Node2 next;
  public Node2(Object data,Node2 next)
  {
    this.data=data;
    this.next=next; 
  }
  public Node2(int data){
      this.val=data;
  }
}