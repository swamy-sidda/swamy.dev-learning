package innerclasses;

public class ThisContext {
    static int i=10;
    class Inner2{
      static int i=100;
      public void m1(){
          System.out.println("for first time"+i);
          System.out.println("for next time"+ThisContext.i);
          System.out.println("for third time"+this.i);
          System.out.println("for fourth time"+ThisContext.this.i);
      }
    }
    public  void m2(){
       System.out.println(i);
//          System.out.println(ThisContext.i);
//          System.out.println(Inner2.i);
    }
     static void main(String[] args) {
       ThisContext c = new ThisContext();
       c.m2();
       //ThisContext.Inner2 c2 =new ThisContext.new Inner2();
        // new ThisContext.new Inner2().m1();
        ThisContext.Inner2 i2=c.new Inner2();
        i2.m1();
    }
}
