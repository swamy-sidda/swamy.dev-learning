

public class InheritanceChecking {
    public static void main(String[] args) {
//        new B1();
//        System.out.println("------------");
//        new B1(10);
//        System.out.println("------------");
        new BTerm(10,20,30);
    }
}
class A1{
    A1(){
        System.out.println("A non parameterized constructor");
    }
    A1(int a){
        System.out.println("A parameter ");
    }
}
class BTerm extends A1{
     BTerm(){
        System.out.println("B");
    }
     BTerm(int a){
        System.out.println("B parameterized constructor ");
    }
    BTerm(int a,int b,int c){
         System.out.println("B parameterized three   ");
    }
}
