package strings;

import java.util.Scanner;
class Palindromes
{
  public static void main(String ar[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a String");
   String str=sc.nextLine();
   System.out.println(isPallindrome(str));
   boolean b=isPallindrome(str);
   if(b==true){
    System.out.println("pallindrome");}
   else {
    System.out.println("not pallindrome");}
  }
   static boolean isPallindrome(String s)
   {
   char[] a=s.toCharArray();
   int i=0,j=a.length-1;
   while(i<j)
   {
   if(a[i]!=a[j]) return false;
   i++;
   j--;
   }
   return true;
  }
}