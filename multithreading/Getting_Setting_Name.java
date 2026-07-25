package multithreading;

public class Getting_Setting_Name {
     static void main(String[] args) {
        //public final String getName()
        //public final void setName(String Name)
        System.out.println(Thread.currentThread().getName());
        ThreadConstructors1 m1 = new ThreadConstructors1();
        System.out.println(m1.getName());
        ThreadConstructors1 m2 = new ThreadConstructors1();
        System.out.println(m2.getName());
        ThreadConstructors1 m3 = new ThreadConstructors1();
        System.out.println(m3.getName());
        ThreadConstructors1 m4 = new ThreadConstructors1();
        System.out.println(m4.getName());
        ThreadConstructors1 m5 = new ThreadConstructors1();
        System.out.println(m5.getName());
        Thread.currentThread().setName("pawankalyan");
        System.out.println(Thread.currentThread().getName());
        m1.setName("kumarswamy");
        m2.setName("usman");
        m3.setName("dinesh");
        m4.setName("prince");
        m5.setName("prabha");
        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m3.getName());
        System.out.println(m4.getName());
        System.out.println(m5.getName());
        System.out.println(Thread.currentThread());
        ThreadConstructors6 m6 = new ThreadConstructors6();
        System.out.println(m6.getName());
        System.out.println(Thread.currentThread());
        System.out.println(m6.currentThread());
    }
}
class ThreadConstructors1 extends Thread{
    @Override
    public void run(){
        System.out.println("thread 1");
    }

}
class ThreadConstructors2 extends Thread {
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}
    class ThreadConstructors3 extends Thread {
        @Override
        public void run() {
            System.out.println("thread 1");
        }
    }
class ThreadConstructors4 extends Thread {
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}
class ThreadConstructors5 extends Thread {
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}
class ThreadConstructors6 extends Thread {
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}