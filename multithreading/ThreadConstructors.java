package multithreading;

public class ThreadConstructors {
     static void main(String[] args) {
        Thread t1=new Thread();
        MyRunnable1 r=new MyRunnable1();
        Thread t2=new Thread(r);
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        System.out.println("runnable 1");
    }
}