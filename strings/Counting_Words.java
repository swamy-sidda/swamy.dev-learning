package strings;

import java.util.Scanner;
public class Counting_Words
{
public static void main(String as[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("ener a String");
   String s=sc.nextLine();
   int count=0;
   for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==' ')
       count++;
    }
   System.out.println(count);
 }
}