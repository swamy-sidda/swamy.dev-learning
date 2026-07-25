package innerclasses;

public class ThreadDemo {
     static void main(String[] args) {
        Thread t=new Thread()
        {
            public void run(){
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        };
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
