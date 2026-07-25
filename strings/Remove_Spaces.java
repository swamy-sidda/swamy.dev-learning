package strings;

import java.util.Scanner;
public class Remove_Spaces
{
    public static void main(String ae[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                str+=ch;
        }
        System.out.println(str);
    }
}