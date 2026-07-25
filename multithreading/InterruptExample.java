package multithreading;

public class InterruptExample {
    public static void main(String[] args) {
      InterruptThread in=new InterruptThread();
        in.start();
        in.interrupt();
        for(int i=0;i<10;i++){
            System.out.println("main Thread-->"+i);
        }

    }

}
class InterruptThread extends Thread {
    @Override
    public void run() {
        System.out.println("I am lazy Thread");

       for(int i=0;i<10;i++){
           System.out.println("child Thread-->"+i);
           try {
               Thread.sleep(400);
           } catch (InterruptedException e) {
           }
       }
       System.out.println(" lazy Thread execution completed");
    }
}
