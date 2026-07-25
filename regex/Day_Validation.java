package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Day_Validation
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day to validate");
        String date=sc.nextLine();
        Pattern p=Pattern.compile("([0-1][1-9])|(1[0-9])|(2[0-9])|(3[0,1])");
        Matcher m=p.matcher(date);
        if(m.matches())
            System.out.println("valid day") ;
        else
            System.out.println("Invalid day");
    }
}