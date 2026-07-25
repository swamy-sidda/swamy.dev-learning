package multithreading;
//case 1:
//if we make a thread nature is daemon and start the thread before another non-daemon thread this thread also get chance to execute
//because of the non-demon threads  get chance of execution after available daemon threads and non-daemon threads may not get chance to
//execute first than deamon thread.

//BASICALLY IT'S ALL DEPENDS ON THE THREAD SCHEDULAR,BUT IT IS ALSO LOOK INTO AVAILABLE THREADS TO ALLOCATE PROCESS THEN SO AVAILABLE
//THREADS ARE DAEMON THREADS IT EXECUTES THAT THREADS OBVIOUSLY



public class DemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Demon();
        t1.setDaemon(true);

        Thread t2 = new Demon1();
        t2.setDaemon(true);
       t2.start();
       t1.start();
        for (int i = 1; i <= 10; i++) {
          System.out.println("Main thread -->"+i);
      }
    }
}
class Demon extends Thread{
    @Override
    public void run() {
        iterate();
    }
    public void iterate(){
        for(int i=0;i<10;i++){
            System.out.println("Demon thread is running at"+i);
        }
    }
}
class Demon1 extends Thread{
    @Override
    public void run() {

    }
    public void iterate(){
        for(int i=0;i<10;i++){
            System.out.println("Demon1--> thread "+i);
        }
    }
}
