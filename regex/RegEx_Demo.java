package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegEx_Demo
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s=sc.nextLine();
        Pattern p=Pattern.compile(".*");
        Matcher m=p.matcher(s);
        while(m.find())
        {
            System.out.println("++++++++++++++++++");
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
        }
        Pattern p1=Pattern.compile(".+");
        Matcher m1=p1.matcher(s);
        while(m1.find())
        {
            System.out.println("++++++++++++++++++");
            System.out.println(m1.start());
            System.out.println(m1.end());
            System.out.println(m1.group());
        }


        Pattern p2=Pattern.compile(".");
        Matcher m2=p2.matcher(s);
        while(m2.find())
        {
            System.out.println("++++++++++++++++++");
            System.out.println(m2.start());
            System.out.println(m2.end());
            System.out.println(m2.group());
        }

    }
}