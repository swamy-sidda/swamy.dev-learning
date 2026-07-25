package java8.lambda;

public class SimpleLambda {
   static  void main(String[] args) {
      Test t=()->System.out.println("Hello World");
      t.m1();
  }
}
interface Test{
    void m1();
}

