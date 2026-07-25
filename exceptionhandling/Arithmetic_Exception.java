package exceptionhandling;

public class Arithmetic_Exception//unchecked
{
 public static void main(String ah[])
  {
 try{
     System.out.println(10/0);
    }catch(ArithmeticException e){
     System.out.println(e.getMessage());
     System.out.println("--------------------");
     e.printStackTrace();
    } 
 }
}