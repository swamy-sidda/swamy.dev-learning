package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Count_Char
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with repeated characters");
        String s=sc.nextLine();
        Pattern p=Pattern.compile("([a-z])\\1*");
        Matcher m=p.matcher(s);
        String s1="";
        while(m.find())
        {
            String match=m.group();
            s1+=match.length()+match.substring(0,1);
            s1+=" ";
        }
        System.out.println(s1);

    }
}