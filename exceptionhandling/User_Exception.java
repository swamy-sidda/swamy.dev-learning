package exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class User_Exception
{
  public static void main(String ars[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enterd the password"); 
    String password=sc.nextLine();
    Pattern p=Pattern.compile("^[A-Z]([a-z 0-9]{5})");
    Matcher m=p.matcher(password);
    boolean b=false;

    if(m.matches())
       { 
         b=true;
       }
             
      if(b)
       {
         System.out.println("entered password is correct");
       }
      else
       {
         try{
             throw new InvalidInputException("enter the correct input");
  
            }catch(InvalidInputException e){
             System.out.println("InvalidInputException");
             System.out.println(e.getMessage());
             System.out.println("please enter with in 5 chances");
            }
       } 
  }
}

