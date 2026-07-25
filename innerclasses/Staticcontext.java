package innerclasses;

public class Staticcontext {
    public static void m1(){
       System.out.println("m1");
       Inner.m1();
      // Staticcontext.m1();
    }
     static void main(String[] args) {
        System.out.println(" outer main");
        Staticcontext.m1();
        m1();
    }
    class Inner{
        public static void m1(){
            System.out.println("m1");
        }
        public static void main(){
            System.out.println(" inner main");
        }
    }
}
