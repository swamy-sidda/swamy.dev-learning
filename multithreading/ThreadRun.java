package multithreading;

public class ThreadRun {
    public static void main(String[] args) {
    Demo5 demo = new Demo5();
    demo.start();
    Thread.yield();
    Demo5 demo1 = new Demo5();
    demo1.start();

    }
}
class Demo5 extends Thread {
    @Override
    public void run() {
      Demo5 demo = new Demo5();
        try {
            demo.method2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public  void  method2() throws InterruptedException {
        for(int j=0;j<10;j++){
            System.out.println("iteration number "+j);
        }
    }
}