import java.util.Scanner;
import static java.lang.Math.*;
 public  class Static_Import
{
 public static void main(String as[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int number1=sc.nextInt();
  System.out.println("Enter exponential to the given number");
  int number2=sc.nextInt();
  System.out.println("power of number1 and number2 is "+pow(number1,number2));
  
 }
}