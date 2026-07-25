package exceptionhandling;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class User_Exception3
{
  public static void main(String ak[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your gmail");
   String s=sc.nextLine();
   Pattern p=Pattern.compile("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
   Matcher m=p.matcher(s);
   boolean b=false;
   if(m.matches())
   {
    b=true;
   }
    System.out.println(b);
   if(b)
    {
      System.out.println("validation done for mail");
      System.out.println("enter the pass word in 6 characters");
      String s1=sc.nextLine();
      Pattern p1=Pattern.compile("[\\w]+");
      Matcher m1=p1.matcher(s1);
      boolean b1=false;
      if(m1.matches())
      {
      b1=true;
      }
        
      System.out.println(b1);
      if(b1)
      {
        System.out.println("password also correct");
        System.out.println("U R welcome to mail assistance");
      }else{
            try{
              throw new PasswordMismatchException("Password Invalid");
               }catch(PasswordMismatchException e){
                System.out.println(e.getMessage()); 
                System.out.println("PasswordMismatchException first learn how to create a password!!!!!");   
               }
           }
    }
    else{
          try{
           throw new MailMismatchException("Invalid mail id");
             }catch(MailMismatchException e){
              System.out.println(e.getMessage());
              System.out.println("MailMismatchException first learn how to create a mail!!!!!");  

             }
        }   
  }
}







