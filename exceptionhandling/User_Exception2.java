package exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class User_Exception2
{
 public static void main(String as[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your name");
   String name=sc.nextLine();
   System.out.println("enter your phone number");
   String phno=sc.nextLine();
   Pattern p=Pattern.compile("[A-Z]{1}([a-z])+");
   Matcher m=p.matcher(name);
   Pattern p1=Pattern.compile("[6-9][0-9]{9}");
   Matcher m1=p1.matcher(phno);
   boolean b=false;
  if(m.matches())
     {
       if(m1.matches())
       {
          b=true;
       }
     }
       if(b)
       {
         System.out.println("Welcome to Facebook"); 
       }
        else{
         try{
             throw new InputMismatchedException("enter the correct input");
  
            }catch(InputMismatchedException e){
             System.out.println("InputMismatchedException");
             System.out.println(e.getMessage());
             System.out.println("please enter with in 5 chances");
            }
       } 
 }
}

class InputMismatchedExceptions extends RuntimeException
{
  private String msg;
  InputMismatchedExceptions(String msg)
  {
     this.msg=msg;
  }
 public String getMessage()
 {
   return msg;
 }
}


