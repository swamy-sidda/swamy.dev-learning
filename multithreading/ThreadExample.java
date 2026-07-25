package multithreading;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
   Example thread = new Example();
   thread.start();
   thread.join();
   Example2 thread2 = new Example2();
   Thread t1=new Thread(thread2);
   t1.start();
   t1.join();
    }
}
class Example extends Thread{
    @Override
    public void run() {
        Example thread2 = new Example();
        System.out.println("Thread created by using inheriting thread class");
        try {
            thread2.method1();
            thread2.method2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void  method1() throws InterruptedException {
        for(int j=0;j<100;j++){
            System.out.println("method1 "+j);
        }
    }
    public void method2(){
        for(int j=0;j<100;j++){
            System.out.println("method2 "+j);
        }
    }
}
class Example2 implements Runnable{
    @Override
    public void run() {
        Example2 thread2 = new Example2();
        System.out.println("Thread created by implementing runnable interface");
        try {
            thread2.method1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void method1() throws InterruptedException {
        for(int j=0;j<100;j++){
            System.out.println("method1 "+j);
        }
    }
}
