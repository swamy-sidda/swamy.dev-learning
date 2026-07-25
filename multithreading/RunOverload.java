package multithreading;

public class RunOverload {
     static void main(String[] args) {
      RunOverload1 t=new RunOverload1();
     // t.start();
      t.run(10);
      t.run(20);
      t.start();
    }
}
class RunOverload1 extends Thread {
    @Override
    public void run() {
        System.out.println("NO arg method");
    }
    public void run(int i)
    {
       System.out.println("int arg method");
    }
}