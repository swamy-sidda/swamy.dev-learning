package multithreading;

public class JoinDemo {
    public static void main(String[] args)  {
        Season_Driver season = new Season_Driver();
        season.run();
    }
}
class Season_Driver {
    static Summer summer = new Summer();;
    static Winter winter=new Winter() ;
    static Automn automn=new Automn() ;
    static Spring spring=new Spring() ;
    static Rainy rainy=new Rainy() ;
    public void run()
    {
        automn.start();

        summer.start();

        rainy.start();

        spring.start();

        winter.start();
    }


}
class Summer extends Thread{
    public void run(){
        try {
             Season_Driver.automn.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Summer is started ");
        for (int i=0;i<5;i++) {
            System.out.println("Summer days are completing-2");
        }
        System.out.println("Summer is over");
    }
}
class Winter extends Thread{
    public void run(){
        try {
            Season_Driver.spring.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Winter is started");
        for (int i=0;i<5;i++) {
            System.out.println("Winter days are completing-5");
        }
        System.out.println("Winter is over");
    }
}
class Automn extends Thread{
    public void run(){
        System.out.println("Automn is started ");
        for (int i=0;i<5;i++) {
            System.out.println("Automn days are completing-1");
        }
        System.out.println("Automn is over");
    }
}
class Spring extends Thread{
    public void run(){
        try {
            Season_Driver.rainy.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Spring is started ");
        for (int i=0;i<5;i++) {
            System.out.println("Spring days are completing-4");
        }
        System.out.println("Spring is over");
    }
}
class Rainy extends Thread{
    public void run(){
        try {
            Season_Driver.summer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Rainy is started ");
        for (int i=0;i<5;i++) {
            System.out.println("Rainy days are completing-3");
        }
        System.out.println("Rainy is over");
    }
}
