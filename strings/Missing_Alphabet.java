package strings;

import java.util.Scanner;
public class Missing_Alphabet
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        String dd="abcdefghijklmnopqrstuvwxyz";
        while(s1.length()>0)
        {
            char ch=s1.charAt(0);
            for(int i=0;i<dd.length();i++)
            {
                if(ch==dd.charAt(i))
                {
                    dd=dd.replace(ch+"","");
                }
            }
            s1=s1.substring(1);
        }
        System.out.println(dd);
    }
}