package multithreading;

public class Demo3 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.setName("Thread-1");
        Thread t2=new Thread2();
        t2.setName("Thread-2");
        Thread t3=new Thread3();
        t3.setName("Thread-3");
        t1.start();
        t1.setPriority(7);
        System.out.println(t1.getPriority());
        System.out.println(t1.getName());

        t2.start();
        t2.setPriority(8);
        System.out.println(t2.getPriority());
        System.out.println(t2.getName());
        t3.start();
        t3.setPriority(9);
        System.out.println(t3.getPriority());
        System.out.println(t3.getName());
        Thread.currentThread().setName("Main Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
class Thread1 extends Thread{
    public void run(){
        System.out.println("child Tread Execution 1");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("child Tread Execution 2");
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("child Tread Execution 3");
    }
}
