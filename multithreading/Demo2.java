package multithreading;

public class Demo2 {
    public static void main(String[] as)
    {

        MyThread t1=new MyThread();
        Thread t2=new Thread(t1);
       t2.start();//
//        for(int i=1;i<=5;i++)
//        {
//            System.out.println("Main Tread Execution "+i);
//            System.out.println("Main Tread Execution "+i);
//        }
        //case 1
      //  t1.start();------> compile time error
        //t1.run();----> it will call the corresponding instance as normal run() method
        //t2.run();---> won't create thread it execute run() method which is available

    }
    }
class Yield1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("----->child Tread Execution "+i);
        }
    }
}
