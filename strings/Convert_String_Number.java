package strings;

import java.util.Scanner;
public class Convert_String_Number
{
    public static void main(String cd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number in String");
        String s=sc.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int sum=0;
            char ch=s.charAt(i);
            sum=(int)(ch-'0');
            res=(res*10)+sum;
        }
        System.out.println(res);
    }
}