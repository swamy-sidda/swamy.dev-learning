package basics;

public class Covarient {
     static void main(String[] args) {
      Parent p = new Parent();
      Machine m=p.getAction();

      Child c=new Child();
      Machine m1=c.getAction();

      System.out.println(m1);
      System.out.println(m);
      System.out.println("-------------------");

//      A a=p.getAction1();
//      A a1=c.getAction1();
//      System.out.println(a);
//      System.out.println(a);
   }
}
class Machine{}
class Printer extends Machine{}
class Scanner extends Printer{}


class A{}
class B extends A{}


class Parent {
    Machine getAction(){
        return new Machine();
    }
//    B getAction1(){       it is voilating the parent access in child , it is not possible to return parent type from child.
//        return new B();   it possible in the case of Parent,parent type from child.it possible in the case of Parent
//                          should contains parent type and child should contian child type of parent return ype
//    }
}
class Child extends Parent {
    Printer getAction(){
        return new Printer();
    }
//    A getAction1(){
//        return new A();
//    }
}
