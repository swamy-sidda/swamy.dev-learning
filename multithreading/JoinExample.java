package multithreading;

public class JoinExample {
   static Venue v;
   static Wedding w;
   static CardDistribution c;
     static void main(String[] args) throws InterruptedException {
        v=new Venue();
        w=new Wedding();
        c=new CardDistribution();
       v.start();

       w.start();

       c.start();

    }
}
class  Venue extends Thread{
    @Override
    public void run()  {
        for(int i=0;i<15;i++) {
            System.out.println("Venue"+" "+i);
        }
    }
}
class Wedding extends Thread{
    @Override
    public void run() {
        try{
            JoinExample.c.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0;i<15;i++) {
            System.out.println("Wedding"+" "+i);
        }
    }
}
class CardDistribution extends Thread{
    @Override
    public void run() {
        try{
            JoinExample.v.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0;i<15;i++) {
            System.out.println("Distribution"+" "+i);
        }
    }
}
