package strings;

import java.util.Scanner;
class Count
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number with numbers");
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int sum=0;
        for(char c:a)
        {
            if(c>='0'&&c<='9')
            {
                sum+=(c-'0');
            }
        }
        System.out.println("sum of digits in number is "+sum);
    }
}