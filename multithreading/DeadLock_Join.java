package multithreading;

public class DeadLock_Join {
    static Waiter1 waiter1=new Waiter1() ;
    static Waiter2 waiter2=new Waiter2() ;
    static Waiter3 waiter3=new Waiter3() ;
    public static void main(String[] args) {

        waiter1.start();

        waiter2.start();

        waiter3.start();
    }
}
class Waiter1 extends Thread {
    public void run() {
        System.out.println("Waiter-1 is started");
        for(int i=1;i<=5;i++){
            System.out.println("Waiter-1 is running"+i);
            if(i==2){
                try {
                    System.out.println("Waiter-1 is waiting for thread 2 ");
                    DeadLock_Join.waiter2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class Waiter2 extends Thread {
   public void run(){
       System.out.println("Waiter-2 is started");
       for(int i=1;i<=5;i++){
           System.out.println("Waiter-2 is running"+i);
           if(i==2){
               try {
                   System.out.println("Thread-2 is waiting for thread-3");
                   DeadLock_Join.waiter3.join();
               } catch (InterruptedException e) {}
           }
       }
   }
}
class Waiter3 extends Thread {
    public void run(){
        System.out.println("Waiter-3 is started");
        for(int i=1;i<=5;i++){
            System.out.println("Waiter-3 is running"+i);
            if(i==2){
                try {
                    System.out.println("Thread-3 is waiting for Thread-1");
                    DeadLock_Join.waiter1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
