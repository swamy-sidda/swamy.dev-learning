package multithreading;

public class YieldExample22 {
     static void main(String[] args) throws InterruptedException {
      MyThread12 t1=new MyThread12();
      MyThread12 t2=new MyThread12();
      MyThread12 t3=new MyThread12();
      t1.setPriority(1);
      t1.setName("<--1-->Karan");
      t2.setPriority(6);
      t2.setName("kumar<--2-->");
      t3.setPriority(10);
      t3.setName("<--3-->swamy-->");
      t1.start();
      t1.join();

      t2.start();
      t1.join();

      t3.start();
      t3.join();
    }
}
class MyThread12 extends Thread{
public void run(){
    for (int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+i);
        Thread.yield();
    }
}
}

