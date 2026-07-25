package multithreading;

public class Demo111 {
  public static void  main(String[] args) {
   MyThread1 t1=new MyThread1();
   t1.start();
   for(int i=0;i<10;i++){
       System.out.println("Main Tread Execution "+i);
   }
  }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("MyThread Class "+i);
        }
    }
}
