package doublylinkedlist;

class DoublyLinkedList_Implementation1
{
 Node11 first;
 Node11 last;
 int count;
//@@
//addind as last node
  
public void add(char e)
{
 if(first==null)
 {
   first=new Node11(e,null,null);
   last=first;
   count++;
   return;
 }
  last.next=new Node11(e,last,null);
  last=last.next;
  count++;
}
//@@
//size of list

public int size()
{
return count;
}


//@@
//adding as middle one in betweenlast and first

public void add(char e,int index)
{
  if(index<=-1||index>=size())
  {
  throw new IndexOutOfBoundsException();
  }
 if(index==0)
 {
  first=new Node11(e,null,first);
  first.next.prev=first;
  count++;
  return;
 }
 Node11 curr=first;
 for(int i=1;i<index;i++)
 {
   curr=curr.next;
 }
 Node11 n=new Node11(e,curr,curr.next);
 curr.next.prev=n;
 curr.next=n;
 count++;
}
//@@
//get an element from list

public char get(int index)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
 Node11 curr=first;
 for(int i=1;i<=index;i++)
 {
 curr=curr.next;
 }
 return curr.ch;
}
//@@
//removing the list items/elements

public void remove(int index)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
 if(index==0)
 {
  first=first.next;
  if(first!=null) first.prev=null;
  if(first==null) last=null;
  count--;
  return;
 }
 if(index==size()-1)
 {
  last.prev.next=null;
  last=last.prev;
  count--;
  return;
 }
  Node11 curr=first;
  for(int i=1;i<index;i++)
  {
   curr=curr.next;
  }
   curr.next.next.prev=curr;
   curr.next=curr.next.next;
   count--;
}

@Override
public String toString()
{
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

public void set(int index,char e)
{
 if(index<=-1||index>=size())
 {
  throw new IndexOutOfBoundsException();
 }
  Node11 curr=first;
  int i=0;
  while(i<index)
  {
    curr=curr.next;
    i++;
  }
  curr.ch=e;
}


public void reverse()
{
 Node11 curr=first;
 Node11 temp=null;
 while(curr!=null)
 {
  
  temp=curr.prev;
  curr.prev=curr.next;
  curr.next=temp;
  curr=curr.prev;
 }
 if(temp!=null)
 {
  last=first;
  first=temp.prev;
 }
}
}







