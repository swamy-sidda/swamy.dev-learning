package doublylinkedlist;

public class Char_Implementation
{
    public static void main(String ad[])
    {
        DoublyLinked_chars cd=new DoublyLinked_chars();
        cd.add('a');
        cd.add('s');
        cd.add('2');
        cd.add('1');
        System.out.println(cd.get(0));
        System.out.println(cd);
    }

}