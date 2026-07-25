package multithreading;

public class SynchronizationDemo {

    public static void main(String[] args) {
        Wish wish = new Wish();
        WithoutSynchronization t1 = new WithoutSynchronization(wish, "Kumar Swamy");
        WithoutSynchronization t2 = new WithoutSynchronization(wish, "Mohith Reddy");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
           e.printStackTrace();
        }

        System.out.println("======================================================");

        Display display = new Display();
        WithSynchronization t3 = new WithSynchronization(display, "Kumar Swamy");
        WithSynchronization t4 = new WithSynchronization(display, "Mohith Reddy");

        t3.start();
        t4.start();
    }
}

/*  WITHOUT SYNCHRONIZATION  */

class WithoutSynchronization extends Thread {

    private Wish wish;
    private String name;

    public WithoutSynchronization(Wish wish, String name) {
        this.wish = wish;
        this.name = name;
    }

    @Override
    public void run() {
        wish.display(name);
    }
}

class Wish {

    // Not synchronized
    public void display(String name) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Good Morning Mr."+name);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/* WITH SYNCHRONIZATION  */

class WithSynchronization extends Thread {

    private Display display;
    private String name;

    public WithSynchronization(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.display(name);
    }
}

class Display {

    // Synchronized method
    public synchronized void display(String name) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Good Morning Mr."+name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}