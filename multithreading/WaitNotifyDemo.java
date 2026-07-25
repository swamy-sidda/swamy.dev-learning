package multithreading;

public class WaitNotifyDemo {
    static void main() {
        Object obj = new Object();
        Thread t1=new Thread(()->{
            synchronized (obj){
                System.out.println("Thread 1 is  waiting........");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is  resumed........");
            }
        });
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj){
            System.out.println("Main Thread is  notifying........");
            obj.notify();
        }

    }
}
