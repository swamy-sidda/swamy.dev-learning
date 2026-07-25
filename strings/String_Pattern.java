package strings;

import java.util.Scanner;
public class String_Pattern
{
    public static void main(String fda[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}