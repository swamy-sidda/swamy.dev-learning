package strings;

import java.util.Scanner;
public class Find_Next_Constent
{
    public static void main(String ad[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String s1="";
        char[] a="bcdfghjklmnpqrstvwxyz".toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=0;j<a.length;j++)
            {
                if(ch=='z')
                {
                    s1+='b'+"";
                    break;
                }
                else if(ch<a[j])
                {
                    s1+=a[j]+"";
                    break;
                }
            }
        }
        System.out.println(s1);
    }
}