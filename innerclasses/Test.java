package innerclasses;

 class Outer1 {
     static int i=100;
     private int j=200;
    public void motar()
    {
        System.out.println("Outer class executed");
        System.out.println(i);
        System.out.println(j);
    }
    class Inner{
        public void engine ()
        {
            System.out.println("Inner class executed");
            System.out.println(i);
            System.out.println(j);
        }
    }
}
public class Test{
      static void main(String[] args) {
         Outer1 o = new Outer1();
         o.motar();
         //Outer1.Inner o2 = new Outer1.new Inner();
         Outer1.Inner o2 = o.new Inner();
         o2.engine ();
     }
}