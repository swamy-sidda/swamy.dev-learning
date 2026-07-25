import java.util.Scanner;
import java.util.*;

public class Find_Next_TermVowel
{
 public static void main(String hh[])
 {
   Scanner sc=new Scanner(System.in);
   String s1="";
   System.out.println("enter String");
   String s=sc.nextLine();
   char[] a={'a','e','i','o','u'};
   for(int i=0;i<s.length();i++)
   {
     char c=s.charAt(i);
     for(int j=0;j<a.length;j++)
     {
      if(c>='u')
      {
        s1+='a'+"";
      }
      if(c<a[j]){
      s1+=a[j]+"";
      continue;
      }
     }
   }
    System.out.println(s1); 
 }
}









