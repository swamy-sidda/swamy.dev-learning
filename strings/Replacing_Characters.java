package strings;

import java.util.Scanner;
public class Replacing_Characters
{
public static void main(String ad[])
 {
   Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
     {
       char ch=s.charAt(i);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       {
         s=s.replace(ch+"","*");
       }
     }
     System.out.println(s);
 }
}