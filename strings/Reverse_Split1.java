package strings;

import java.util.Scanner;
class Reverse_Split1
{
    public static void main(String ag[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s=sc.nextLine();
        split_Executor(s);
    }
    static void split_Executor(String s)
    {
        String[] s2=s.split(" ");
        for(int i=0;i<=s2.length-1;i++)
        {
            //String s1="";
            String str=s2[i];
            char[] a=str.toCharArray();
            for(int j=a.length-1;j>=0;j--)
            {
                String s1="";
                s1+=a[j];
                System.out.print(s1);

            }
            System.out.print(" ");
        }
    }
}