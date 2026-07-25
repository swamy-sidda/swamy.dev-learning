package multithreading;

public class ThreadPriority {
     static void main(String[] args) {
//        ThreadPriority t1 = new ThreadPriority();
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
//        Thread2 thread2 = new Thread2();
//        Thread3 thread3 = new Thread3();
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());
//        Thread4 thread4 = new Thread4();
//        Thread5 thread5 = new Thread5();
//        System.out.println(thread4.getPriority());
//        System.out.println(thread5.getPriority());
//        System.out.println("______");
//        thread2.setPriority(2);
//        thread3.setPriority(3);
//        thread4.setPriority(7);
//        thread5.setPriority(18);//IllegalArgumentException
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());
//        System.out.println(thread4.getPriority());
//        System.out.println(thread5.getPriority());

        Thread4 thread4 = new Thread4();
        thread4.start();
        Thread5 thread5 = new Thread5();
        thread5.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread3 thread3 = new Thread3();
        thread3.start();
    }
}
class Thread21 extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println("2 run");
            Thread.yield();
        }
    }
}
class Thread31 extends Thread2{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("3");
            Thread.yield();
        }
    }
}
class Thread4 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Thread 4 run");
            Thread.yield();
        }
    }
}
class Thread5 extends Thread4{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Thread 5");
            Thread.yield();
        }
    }
}
