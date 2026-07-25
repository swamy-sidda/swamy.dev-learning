package strings;

import java.util.Scanner;
import java.util.Arrays;
public class Bigger_Palindrome
{
    public static void main(String agv[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String containing palindrome");
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        String s2=isPalindrome(arr);
        System.out.println(s2);
    }
    public static String  isPalindrome(String arr[])
    {
        String s1="";
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            int j=s.length()-1,k=0;
            boolean flag=true;
            while(k<j)
            {
                if(s.charAt(k)!=s.charAt(j))
                {
                    flag=false;
                    break;
                }
                k++;
                j--;
            }
            if(flag && s.length()>s1.length())
                s1=s;
        }
        return s1;
    }
}