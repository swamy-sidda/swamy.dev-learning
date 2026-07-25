package linkedlist;

public class LinkedList_Implementation3
{
 private Node1 first=null;
 private Node1 last=null;
 private int count=0;

public void add(Object e)
{
 if(first==null)
 {
  first=new Node1(e, last, null);
  last=first;
  count++;
  return;
 }
 last.next=new Node1(e, last, null);
 count++;
 last=last.next;
}
public int size()
{
  return count;
}

public String toString()
{
 if(first==null) return "[]";
 Node1 curr=first;
 String s="["+curr.ele;
 while(curr.next!=null)
 {
  curr=curr.next;
  s+=","+curr.ele;
  //curr=curr.next;
 }
 s+="]";
 return s;
}
public void add(int index,Object e)
{
  if(index<=-1||index>=size())
  {
    throw new IndexOutOfBoundsException();
  }
  if(index==0)
  {
    first=new Node1(e, last, first);
    count++; 
    //return;
  }
  Node1 curr=first;
  for(int i=1;i<index;i++)
  {
   curr=curr.next;
  }
  curr.next=new Node1(e, last, curr.next);
  count++;
} 
public Object get(int index)
{
 if(index<0||index>=size())
 {
   throw new IndexOutOfBoundsException();
 }
 Node1 curr=first;
 for(int i=1;i<=index;i++)
 {
  curr=curr.next;
 }
 return curr.ele;
}
public void remove(int index)
{
 if(index<0||index>=size())
 {
   throw new IndexOutOfBoundsException();
 }
 if(index==0)
 {
  first=first.next;
  if(first==null) last=null;
  count--;
  return;
  }
  Node1 curr=first;
  for(int i=1;i<index;i++)
  {
    curr=curr.next;
  }
  curr.next=curr.next.next;
  count--;
  return;
 }
public void reverse()
{
 Node1 next=null;
 Node1 prev=null;
 Node1 curr=first;
 while(curr!=null)
 {
   next=curr.next;
   curr.next=prev;
   prev=curr;
   curr=next;
 }
   last=first;
   first=prev;
}
}



