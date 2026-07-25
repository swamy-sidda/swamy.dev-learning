package strings;

import java.util.Scanner;
public class String_Sorting
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String ");
        String s=sc.nextLine();
        System.out.println(sort(s));

    }
    public static String sort(String s)
    {
        char[] a=s.toCharArray();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        String s1="";
        for(int i=0;i<a.length;i++)
        {
            s1+=a[i]+"";
        }
        return s1;
    }
}