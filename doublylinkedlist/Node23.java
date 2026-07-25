package doublylinkedlist;

public class Node23
{
 Node23 prev;
 Node23 next;
 Object ele;
 public Node23(Object e)
 {
  this.ele=e;
  prev=next=null;
 }
 public Node23(Object e,Node23 prev,Node23 next)
 {
  this.ele=e;
  this.prev=prev;
  this.next=next;
 }
}