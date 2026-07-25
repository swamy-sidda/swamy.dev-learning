package innerclasses;

public class Outer {
    class Inner {
        public void engine() {
            System.out.println("Engine");
        }
    }
     static void main(String[] args) {
       Outer o = new Outer();
       o.motar();
    }
    public void motar(){
        Inner i = new Inner();
        i.engine();
        System.out.println("Motor");
    }
}