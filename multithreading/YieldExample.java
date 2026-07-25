package multithreading;

public class YieldExample {
     static void main(String[] args) {
         Consumer1 c1 = new Consumer1();
         Consumer2 c2 = new Consumer2();


         c1.start();

         c2.start();


    }
}
class Consumer1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Consumer 1");
            if(i%3==0){
              Thread.yield();
            }
        }
    }
}
class Consumer2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Consumer 2 ");
            if(i%3==0){
                Thread.yield();
            }
        }
    }
}
class Consumer3 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Consumer 3");
            if(i%3==0){
                Thread.yield();
            }
        }
    }
}
