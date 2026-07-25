package multithreading;


public class ThreadGroupInformation {
    static void main(){
        System.out.println("Thread name "+Thread.currentThread().getName());
        System.out.println("Thread Id "+Thread.currentThread().getId());
        System.out.println("Group name "+Thread.currentThread().getThreadGroup().getName());

        Call call = new Call();
        System.out.println(call.getName());
        System.out.println(call.getId());
        System.out.println(call.getThreadGroup().getName());

        MyThreadGroupInformation2 myThreadGroupInformation2 = new MyThreadGroupInformation2();
        System.out.println(myThreadGroupInformation2.getName());
        System.out.println(myThreadGroupInformation2.getId());
        System.out.println(myThreadGroupInformation2.getThreadGroup().getName());
        System.out.println(myThreadGroupInformation2.getThreadGroup().getParent());
        System.out.println(myThreadGroupInformation2.getThreadGroup().getParent().getName());
        System.out.println(myThreadGroupInformation2.getThreadGroup().getParent().getMaxPriority());
    }
}
class Call extends Thread {

}
class MyThreadGroupInformation extends Call {

}
class MyThreadGroupInformation2 extends Call {

}
