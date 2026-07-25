package multithreading;

public class ClassLevelLock {
    static void main() {
        ClassLevelLock1 obj=new ClassLevelLock1();
        obj.run();
    }
}
class ClassLevelLock1 extends Thread {
    @Override
    public void run() {
        print();
        display();
        copy();
        runn();
    }
    public static synchronized void print(){
        for(int i=0;i<=10;i++){
            System.out.println("printing........P");
        }
    }
    public static synchronized void copy(){
        for(int i=0;i<=10;i++){
            System.out.println("copying........C");
        }
    }
    public void display() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("displaying........DD");
        }
    }
    public static void runn(){
        for(int i=0;i<=5;i++){
            System.out.println("running........R");
        }
    }
}