package multithreading;

public class ThreadInterruption {
    public static void main(String[] args) {
        InterrupDemo interrupDemo = new InterrupDemo();
        interrupDemo.start();
        interrupDemo.interrupt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main execution is executing");
            interrupDemo.interrupt();
        }
    }
}
class InterrupDemo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("I not Interrupted for "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I am Interrupted because of main");
            }
        }
    }
}
