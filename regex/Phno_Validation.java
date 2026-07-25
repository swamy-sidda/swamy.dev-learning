package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Phno_Validation
{
    public static void main(String d[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter phone number");
        String phno=sc.nextLine();
        Pattern p=Pattern.compile("[6-9][0-9]{9}");
        Matcher m=p.matcher(phno);
        if(m.matches())
        {
            System.out.println("valid phone number");
        }
        else
            System.out.println("In-valid phone number");
    }
}