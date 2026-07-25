package strings;

import java.util.Scanner;
class CountValue
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with numbers");
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int sum=0;
        int res=0;
        for(char c:a)
        {
            if(c>='0'&&c<='9')
            {
                sum=(sum*10)+(c-'0');
            }
            else
            {
                res=res+sum;
                sum=0;
            }
        }
        res=res+sum;
        System.out.println("sum is "+res);
    }
}