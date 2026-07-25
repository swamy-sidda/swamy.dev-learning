package multithreading;

public class Thread11 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            //System.out.println(0/10/0);
            System.out.println("Thread Executed "+i);
        }
    }
}
class Demo1{
     static void main(String[] args){
        Thread1 t=new Thread1();
        t.start();
        for(int i=0;i<=100;i++){
            System.out.println(010/0);
            System.out.println("main Executed "+i);
        }
    }

}
