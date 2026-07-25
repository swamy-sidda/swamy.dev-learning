package multithreading;

public class JoinExample2 {
    public static void main(String[] args) throws InterruptedException {
        Join mt=new Join();
       Join.mt=Thread.currentThread();
      // Join mt=new Join();
       mt.start();
       for(int i=0;i<10;i++)
           {
               System.out.println("main Thread");
           Thread.sleep(500);
           }
    }
}
class Join extends Thread {
    static Thread mt;
    public void run() {
       try{
           mt.join();
       } catch (InterruptedException e) {
           for(int i=1;i<=10;i++)
               System.out.println("child Thread");

       }
    }
}
