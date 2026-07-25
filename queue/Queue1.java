package queue;

public class Queue1
{
    public static void main(String dl[])
    {
        Queue_Implementation1 q=new Queue_Implementation1();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q.isEmpty());
    }
}