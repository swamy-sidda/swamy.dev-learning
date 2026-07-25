package stack;

public class Stack_Node
{
 Object ele;
 Node next;
public Stack_Node(Object e)
{
 this.ele=e;
 this.next=null;
}
public Stack_Node(Object e, Node n)
{
  this.ele=e;
  this.next=n;
}
}