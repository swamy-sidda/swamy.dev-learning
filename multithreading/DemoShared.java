package multithreading;

public class DemoShared {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 4; i++) {
                shared.produce(i);
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 4; i++) {
                shared.consume();
            }
        });
        producer.start();
        consumer.start();
    }
}

class Shared {

    private int data;
    private boolean produced = false;
    private boolean updated = false;
    public synchronized void produce(int value) {
        while (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        produced = true;
        updated = false;
        System.out.println("Original Value : " + value);
        notify();
        while (!updated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Updated Value in Producer : " + data);
        produced = false;
        notify();
    }

    public synchronized void consume() {
        while (!produced || updated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Update shared data
        data = data + 100;
        System.out.println("Consumer updated data to : " + data);
        updated = true;
        notify();
    }
}