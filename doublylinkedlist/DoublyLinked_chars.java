package doublylinkedlist;

public class DoublyLinked_chars
{
 private Node11 first=null;
 private Node11 last=null;
 private int count=0;
public void add(char c)
{
 if(first==null)
 {
  first=new Node11(c,null,null);
  last=first; 
  count++;
  return;
 }
  Node11 curr=new Node11(c,last,null);
  last=curr.next;
  count++;
}


public void add(char c,int index)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
 if(index==0)
 {
  first=new Node11(c,null,first);
  first.next.prev=first;
  count++;
  return;
 }
  Node11 curr=first;
  for(int i=1;i<index;i++)
  {
   curr=curr.next;
  }
  Node11 n=new Node11(c,curr,curr.next);
  //curr.next.prev=n;
  curr.next=n;
  curr.next.prev=n;

  count++;
} 
public int size()
{
 return count;
}
public char get(int index)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
 if(index==0)
 {
   return first.ch;
 }
 Node11 curr=first;
 for(int i=1;i<index;i++)
 {
  curr=curr.next;
 }
 return curr.ch;
} 
public String toString()
{
if(size()==0) return "[]";
 Node11 curr=first;
 String s="["+curr.ch;
 while(curr.next!=null)
 {
  curr=curr.next;
  s+=","+curr.ch;
 }
 s+="]";
 return s;
}
}
