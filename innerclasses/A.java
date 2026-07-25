package innerclasses;

public class A {
    class B{
        public static void b1(){
            System.out.println("b1");
        }
    }
     static void main(String[] args) {
        A a = new A();
        a.a1();
        A.B b=new A().new  B();
        b.b1();
        System.out.println("EXECUTED ONCE");
        A.B b1= a.new B();
        b1.b1();
        System.out.println("EXECUTED twice time");
        new A().new B().b1();
        System.out.println("EXECUTED THRICE time");
    }
    public static void a1(){
        System.out.println("filehandling2");
    }

}
