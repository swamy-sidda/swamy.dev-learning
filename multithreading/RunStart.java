package multithreading;

public class RunStart {
     static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }

    }
}
class RunThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run");
        }
    }
}