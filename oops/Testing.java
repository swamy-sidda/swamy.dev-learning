package oops;
/*
we can abel to create subclass object by assigning to parent reference.
it is not possible to access the subclass properties by using parent reference.
if having same functionality of parent then it is possible.
 */
class Super {
    public void engine() {
        System.out.println("Super class engine");
    }
}
class Sub extends Super {
    @Override
    public void engine() {
        System.out.println("sub class engine");
    }
    public void engine2() {
        System.out.println("engine2");
    }
}
public class Testing {
     static void main(String[] args) {
        Super s = new Sub();
        s.engine();
       // s.engine2(); compile time error
        Sub s2 = new Sub();
    }
}

