package strings;

import java.util.Scanner;

public class Find_Next_Vowel
{
    public static void main(String hh[])
    {
        Scanner sc=new Scanner(System.in);
        String s1="";
        System.out.println("enter String");
        String s=sc.nextLine();
        s=s.toLowerCase();
        char[] a={'a','e','i','o','u','A',};
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<a.length;j++)
            {
                if(c>='u')
                {
                    s1+='a'+"";
                    break;
                }
                else if(c<a[j]){
                    s1+=a[j]+"";
                    break;
                }
            }
        }
        System.out.println(s1);
    }
}









