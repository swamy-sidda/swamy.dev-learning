package strings;

import java.util.Scanner;
public class UL_and_LU
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                str=str+(char)(ch-32);
            }else if(ch>='A'&&ch<='Z')
            {
                str=str+(char)(ch+32);
            }
            else
            {
                str+=ch;
            }
        }
        System.out.println(str);
    }
}