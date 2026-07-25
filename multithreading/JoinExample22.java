package multithreading;

public class JoinExample22 {
    public static void main(String[] as) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        JoinThread jt = new JoinThread();
        JoinThread1 j1 = new JoinThread1();
        JoinThread2 j2 = new JoinThread2();
        jt.start();
        jt.join();
        j1.start();
        j1.join();
        j2.start();
        j2.join();
    }
}
class JoinThread extends Thread {
    public void run() {
        marriageVenue();
    }

    public void marriageVenue() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Venue is fixed to prepare all activities");
        }
    }
}
    class JoinThread1 extends Thread {
        public void run() {
          cardPrinting();
        }

        public void cardPrinting() {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Cards are prepared for distribution");
            }
        }
    }
class JoinThread2 extends Thread {
    public void run(){
       distribution();
    }
    public void distribution()
    {
        for(int j=1;j<=5;j++){
            System.out.println("distribution completed to do all  activities");
        }
    }
}
