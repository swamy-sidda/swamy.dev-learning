package java8.lambda;
@FunctionalInterface
public interface Monday {
    void show();
}
class Demon  {
   public void display(Monday t){
       t.show();
   }
}
class Test6{
    static void main(String[] args) {
     Demon d=new Demon();
     d.display(()->System.out.println("Hello"));
   }
}
