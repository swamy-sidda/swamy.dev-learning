package strings;

import java.util.Scanner;
public class Find_Palindrome_Words
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a statement");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            if(isPalindrome(s1[i]))
            {
                System.out.println(s1[i]);
            }
        }
    }
    public static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}