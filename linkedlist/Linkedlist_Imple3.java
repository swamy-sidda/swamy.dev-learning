package linkedlist;

public class Linkedlist_Imple3
{
  public  static void main(String fgh[])
 {
   LinkedList_Implementation3 a=new LinkedList_Implementation3();
   a.add(10);
   a.add(20);
   a.add(30);
   a.add(40);
   a.add(50);

  //System.out.println(a);
  System.out.println("The size of linked list "+a.size());

  System.out.println(a);
  a.reverse();
  System.out.println(a);
  System.out.println(a.get(2));
  System.out.println(a.get(0));
  a.reverse();
  System.out.println(a);
  System.out.println(a.get(2));
  System.out.println(a.get(0));
 }
}