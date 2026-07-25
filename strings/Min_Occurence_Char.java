package strings;

import java.util.Scanner;
public class Min_Occurence_Char
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int count=s.length();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            String res="";
            int count1=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(ch==s.charAt(j))
                {
                    res+="";
                    count1++;
                }
                else  res+=s.charAt(j);
            }
            s=res;

            if(count>count1)
            {
                s2=ch+"";
                count=count1;
                System.out.println(count+" "+s2);
            }
            count1=0;
            i-=1;
        }
    }
}