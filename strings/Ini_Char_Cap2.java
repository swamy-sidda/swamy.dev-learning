package strings;

import java.util.Scanner;
public class Ini_Char_Cap2
{
    public static void main(String aj[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a statements");
        String s=sc.nextLine();
        String[] str=s.split(" ");
        String dup="";
        for(String s1:str)
        {
            String str1=s1;
            for(int i=0;i<s1.length();i++)
            {
                if(i==0)
                    dup+=(char)((int)str1.charAt(i)-32)+"";
                else
                    dup+=str1.charAt(i)+"";
            }
            System.out.print(dup+" ");
            dup="";
        }

    }
}