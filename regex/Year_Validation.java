package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Year_Validation
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year to validate");
        String year=sc.nextLine();
        Pattern p=Pattern.compile("([2][0][0,1,2][0-5])|([1][9][6-9][0-9])");
        Matcher m=p.matcher(year);
        if(m.matches())
            System.out.println("valid year") ;
        else
            System.out.println("Invalid year");
    }
}