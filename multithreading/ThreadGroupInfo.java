package multithreading;

public class ThreadGroupInfo {
    static void main() {
        ThreadGroup tg = new ThreadGroup("MainGroup");
        Thread t1=new Thread(tg,"Thread1");
        Thread t2=new Thread(tg,"Thread2");
        Thread t3=new Thread(tg,"Thread3");
        Thread t4=new Thread(tg,"Thread4");

        System.out.println(tg.getParent());
        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t1.getName()+":"+t2.getName()+":"+t3.getName()+":"+t4.getName());
        tg.list();
        tg.setMaxPriority(7);
        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());

    }
}
