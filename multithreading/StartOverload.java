package multithreading;

public class StartOverload {
     static void main(String[] args) {
      MyThread t=new MyThread();
      t.start();
      StartOverload s=new StartOverload();
      s.start();
    }
    public void start() {
      System.out.println("overridden start method");
    }
}
class MyThread extends Thread {
   public void run() {
       System.out.println("Mythread method");
   }
}
