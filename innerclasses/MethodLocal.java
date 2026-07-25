package innerclasses;

public class MethodLocal {
     static void main(String[] args) {
      MethodLocal m = new MethodLocal();
      m.Sum();
    }
    public void Sum(){
        class Calculator{
            void Calculate(double a,double b){
                System.out.println(a+b);
            }
        }
        Calculator c = new Calculator();
        c.Calculate(1.87,2.76);
        c.Calculate(3.2,4.5);
        c.Calculate(5.65,6.0);
        c.Calculate(7.54,8.98);
    }
        }



