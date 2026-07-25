package strings;
//counting repetetion of characterv in a string

import java.util.Scanner;
public class Count_Repeat_Chars
{
    public static void main(String sk[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char s1=s.charAt(i);
            String s2="";
            for(int j=0;j<s.length();j++)
            {

                if(s1==s.charAt(j))
                    count++;
                else
                    s2=s2+s.charAt(j);
            }
            System.out.print(s1+"="+count+" ");
            s=s2;
            i=-1;
        }
    }
}


