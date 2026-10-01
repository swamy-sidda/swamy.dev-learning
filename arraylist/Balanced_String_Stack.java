package arraylist;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_String_Stack
{
  static void main(String sd[])
 {
   System.out.println("enter a string");
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   System.out.println(isBalanced(s)); 
}
public static boolean isBalanced(String s1)
{
 String s=removeAlphabet(s1);
 Stack<Character> stk=new Stack<Character>();
 for(int i=0;i<s.length();i++)
 {
  char ch=s.charAt(i);
  if(ch=='{'||ch=='['||ch=='(')
  {
    stk.push(ch);
  }
   else if(ch=='}'||ch==']'||ch==')') 
    if(stk.isEmpty()||!isPair(stk.pop(),ch))
    {
     return false;
    }
  } 
return stk.isEmpty();
}
 public static boolean isPair(char ch1,char ch2)
 {
  if(ch1=='{'&&ch2=='}'||ch1=='['&&ch2==']'||ch1=='('&&ch2==')')
   return true;
  else
   return false;
 }
 public static String removeAlphabet(String s)
 {
  String s1="";
  for(int i=0;i<s.length();i++)
  {
    char ch=s.charAt(i);
    if(ch=='{'||ch=='['||ch=='('||ch=='}'||ch==']'||ch==')')
     s1+=ch+"";
  } 
   return s1;
 }
}



