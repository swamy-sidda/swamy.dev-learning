package multithreading;

public class DeadLock_Join2 {
    static void main() {
        Producer1 p1=new Producer1() ;
        Producer2 p2=new Producer2() ;
        Producer3 p3=new Producer3() ;

        p1.producer2=p2;
        p2.producer3=p3;
        p3.producer1=p1;

        p1.start();

        p2.start();

        p3.start();
    }
}
class Producer1 extends Thread {
    Producer2 producer2;
    public void run()
    {
        System.out.println("Producer 1 is started");
        for(int i=1;i<=5;i++){
            System.out.println("Producer 1 is running");
            if(i==3){
                try {
                    System.out.println("Producer 1 is waiting for producer 2");
                    producer2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class Producer2 extends Thread {
    Producer3 producer3;
    public void run(){
        System.out.println("Producer 2 is started");
        for(int i=1;i<=5;i++){
            System.out.println("Producer 2 is running");
            if(i==3){
                try {
                    System.out.println("Producer 2 Waiting for producer 3 ");
                    producer3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class Producer3 extends Thread {
    Producer1 producer1;
    public void run(){
        System.out.println("Producer 3 is started");
        for(int i=1;i<=5;i++){
            System.out.println("Producer 3 is running");
            if(i==3){
                try {
                    System.out.println("Producer 3 is waiting for producer 1");
                    producer1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


