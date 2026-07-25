package strings;

import java.util.Scanner;
class String_Pallindrome_Rec
{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String");
        String s1=sc.nextLine();
        String s=s1.toLowerCase();
        int start=0,end=s.length()-1;
        if(isPallindrome(s,start,end))
        {
            System.out.println("the one is palindrome");
        }
        else{
            System.out.println("not pallindrome");
        }

    }
    static boolean isPallindrome(String s,int start,int end)
    {
        if(start>=end)
            return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return isPallindrome(s,start+1,end-1);
    }
}