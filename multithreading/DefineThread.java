package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/*
Thread creation csn be possible in three ways
By extending Thread class
By implementing Runnable interface
By implementing Callable interface
  */
public class DefineThread {

     static void main(String[] args) throws Exception {
      MyThread2 t1 = new MyThread2();
      t1.start();
      MyRunnable r = new MyRunnable();
      Thread t3 = new Thread(r);
      t3.start();
      MyThread3 t2 = new MyThread3(Arrays.asList(1,2,3,4,5,6,7,8,9));
         System.out.println(t2.call());

    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 01; i < 5; i++) {
            System.out.println("Thread "+" "+i);
        }
    }
}
class  MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 01; i < 5; i++) {
            System.out.println("Runnable "+" "+i);
        }
    }
}
class MyThread3 implements Callable<Integer> {
    List<Integer> list;
    MyThread3(List<Integer> l) {
        list = l;
    }
    Integer sum=0;
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }
}