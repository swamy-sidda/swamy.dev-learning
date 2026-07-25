package doublylinkedlist;

public class DoublyLinkedList_Imple1
{
 public static void main(String fgh[])
 {
   DoublyLinkedList_Implementation1 a=new DoublyLinkedList_Implementation1();
   a.add('q');
   a.add('w');
   a.add('3');
   a.add('3');

  System.out.println(a);
  System.out.println("The size of linked list "+a.size());
  System.out.println(a.size());
  //a.remove(a.size()-1);
  System.out.println(a.get(3));
  System.out.println(a);
  a.reverse();
  System.out.println(a);
 }
}