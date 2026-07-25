package multithreading;

public class Synchronization2 {
    public static void main(String[] args) {
       Present present = new Present();
       Sync_Example e=new Sync_Example("kumarswamy",present);
       Sync_Example e1=new Sync_Example("Veerabhadra",present);

       e.start();
       e1.start();
       try{
           e.join();
           e1.join();
       } catch (Exception ex) {
           throw new RuntimeException(ex);
       }
        System.out.println("=========================");

        Present present1=new Present();
        e=new Sync_Example("munu swamy",present1);
        e1=new Sync_Example("Karan",present1);

        e.start();
        e1.start();
    }
}
class Present  {
    String name;
    public synchronized void print(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Mr." + name);
        }
    }
}
class Sync_Example extends Thread {
    Present  present;
    String name;
    public  Sync_Example(String name,Present present){
        this.present=present;
        this.name=name;
    }
    public  void run(){
       present.print(name);
    }
}