package basics;

public class StaticInitializer {
    static int i;
    StaticInitializer(int i){
        this.i = i;
    }

     static void main(String[] args) {
        System.out.println("the value is "+i);
        StaticInitializer si = new StaticInitializer(1);
        System.out.println(si.i);
        System.out.println("the value is that"+ i);
    }
}
