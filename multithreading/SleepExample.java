package multithreading;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        Sleep1 s=new Sleep1();
        s.start();
        for(int i=0;i<10;i++)
            {
                System.out.println("Main Threa-->"+i);
               // Thread.sleep(500);
            }
    }
}
class Sleep1 extends Thread{
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                System.out.println("child Thread-->"+i);
                Thread.sleep(700);
            }
    }catch (Exception e){

        }
    }
}
