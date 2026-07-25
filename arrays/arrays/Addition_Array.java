package arrays.arrays;

import java.util.Scanner;

class Addition_Array
{
    public static void main(String ad[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Array size");
        int len1=sc.nextInt();
        int a[]=new int[len1];
        for(int j=0;j<a.length;j++)
        {
            a[j]=sc.nextInt();
        }

        System.out.println("Enter second Array size");
        int len2=sc.nextInt();
        int b[]=new int[len2];
        for(int j=0;j<b.length;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int j=0;j<b.length;j++)
        {
            System.out.print(b[j]+" ");
        }
        System.out.println();
        for(int j=0;j<a.length;j++)
        {
            System.out.print(a[j]+" ");
        }
        System.out.println();

        int min=a.length;
        if(a.length>b.length)
            min=b.length;
        if(min==b.length)
        {
            for(int i=0;i<b.length;i++)
            {
                a[i]+=b[i];
            }
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[j]+" ");
            }
        }
        if(min==a.length)
        {
            for(int i=0;i<a.length;i++)
            {
                b[i]+=a[i];
            }
            for(int j=0;j<b.length;j++)
            {
                System.out.print(b[j]+" ");
            }
        }

    }
}