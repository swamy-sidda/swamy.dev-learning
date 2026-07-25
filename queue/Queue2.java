package queue;

public class Queue2
{
    public static void main(String ad[])
    {
        Queue_Implementation2 a=new Queue_Implementation2();
        a.add(10);
        a.add(20);
        System.out.println(a.poll());
        System.out.println(a.size());
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.peek());
    }
}