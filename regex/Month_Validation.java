package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Month_Validation
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month to validate");
        String date=sc.nextLine();
        Pattern p=Pattern.compile("([0-9])|(0[1-9])|(1[0-2])");
        Matcher m=p.matcher(date);
        if(m.matches())
            System.out.println("valid month") ;
        else
            System.out.println("Invalid month");
    }
}