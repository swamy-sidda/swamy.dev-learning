package linkedlist;

class Add_Integers_To_LinkedList<Integer>
{
  Nodes head;

  public void insertElement(int data)
  {
    Nodes newNode=new Nodes(data);
    if(head==null)
    {
      head=newNode;
      return;
    }
    Nodes temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=newNode;
  } 
 public void printElements()
 {
   Nodes temp=head;
   System.out.print("[ ");
   while(temp.next!=null)
   {
     System.out.print(temp.data+" ");
     temp=temp.next;
   }
   if(temp.next==null)
   System.out.print(temp.next);
   System.out.print("]");
 }
}


public class LinkedList_Add1
{
 public static void main(String fa[])
 {
   System.out.println("Enter elements to linkedlist");
   Add_Integers_To_LinkedList list=new Add_Integers_To_LinkedList();
   list.insertElement(120);
   list.insertElement(130);
   list.insertElement(140);
   list.insertElement(150);
   list.insertElement(160);
   list.insertElement(170);
   list.insertElement(180);
   list.insertElement(190);
   list.insertElement(120);
   list.insertElement(120);
   list.insertElement(140);
   list.insertElement(150);
  

   list.printElements();
   System.out.println();
   System.out.println("process completed");
 }
}



class Nodes
{
  int data;
  Nodes next;
 Nodes(int data)
  {
   this.data=data;
   this.next=null;
  }
}



