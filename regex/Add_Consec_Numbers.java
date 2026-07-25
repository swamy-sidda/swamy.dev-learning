package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Add_Consec_Numbers
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with numbers");
        String s=sc.nextLine();
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(s);
        int sum=0;
        while(m.find())
        {
            sum+=Integer.parseInt(m.group());
        }
        System.out.println(sum);
    }
}