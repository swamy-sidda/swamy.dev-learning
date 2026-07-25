package arrays.arrays;

import java.util.Scanner;
class Even_Store
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] ar=new int[n];
        int i=0;
        System.out.println("enter elements to array");
        while(i<ar.length)
        {
            int ele=sc.nextInt();
            if(ele%2==1||ele<=0)
            {
                System.out.println("enter another element");
                continue;
            }
            ar[i++]=ele;
        }
    }
}