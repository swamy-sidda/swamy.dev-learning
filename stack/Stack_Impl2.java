package stack;

public class Stack_Impl2
{
    public static void main(String []as)
    {
        Stack_Implementation2 s=new Stack_Implementation2();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        s.clear();
        System.out.println(s.isEmpty());
        System.out.println(s);
    }
}