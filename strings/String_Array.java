package strings;
//converting String to Array

import java.util.Arrays;
import java.util.Scanner;

public class String_Array
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char a[] =new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(s.length());
        System.out.println(a.length);
    }
}