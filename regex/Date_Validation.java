package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Date_Validation
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date by using hyphen to validate");
        String date=sc.nextLine();
        Pattern p=Pattern.compile("[([0-1][1-9])|(1[0-9])|(2[0-9])|(3[0,1])][-][([0-9])|(0[1-9])|(1[0-2])][-][(([2][0][0,1,2][0-5])|([1][9][6-9][0-9]))]");
        Matcher m=p.matcher(date);
        if(m.matches())
            System.out.println("valid date") ;
        else
            System.out.println("Invalid date");
    }
}