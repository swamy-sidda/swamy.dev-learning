package strings;

import java.util.Scanner;
public class Missing_Vowel
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s1="aeiou";
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            for(int j=0;j<s1.length();j++)
            {
                char ch2=s1.charAt(j);
                if(ch1==ch2)
                {
                    s1=s1.replace(ch1+"","");
                }
            }
        }
        if(s1.length()>0)
            System.out.println("missed vowels are: "+s1);
        else
            System.out.println("no vowel is missed from the string");
    }
}