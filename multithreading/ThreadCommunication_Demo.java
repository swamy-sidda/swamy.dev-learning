package multithreading;

public class ThreadCommunication_Demo {
     void main() throws InterruptedException {
        Basic_Thread t1=new Basic_Thread();
        t1.start();
        synchronized (t1) {
            t1.wait();
            System.out.println("main thread got notification");
            System.out.println(t1.total);
            System.out.println("Basic_Thread finished");
        }
        System.out.println("main thread execution is finished");
    }
}
class Basic_Thread extends Thread {
    int total=0;
    public void run(){
        System.out.println("Basic_Thread started");
        for(int i=0;i<=100;i++){
            total+=i;
        }
        System.out.println("Basic_Thread giving notification");
        synchronized(this){
            this.notify();

        }
    }
}
