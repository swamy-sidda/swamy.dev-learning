package stack;

public class Stack_Impl1
{
    public static void main(String[] args)
    {
        Stack_Implementation1 s=new Stack_Implementation1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.clear();
        System.out.println(s);

    }
}