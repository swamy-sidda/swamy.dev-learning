package doublylinkedlist;

public class Node11
{
 char ch;
 Node11 next;
 Node11 prev;
public Node11(char c)
{
  this.next=null;
  this.prev=null;
  this.ch=c;
}
public Node11(char c,Node11 p,Node11 n)
{
  this.next=n;
  this.prev=p;
  this.ch=c;
}
}