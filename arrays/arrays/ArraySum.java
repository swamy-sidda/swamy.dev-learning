package arrays.arrays;

import java.util.Scanner;
class ArraySum
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter numbers to array");
        int summ=0;
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
            summ=summ+array[i];
        }
        System.out.println("sum of array numbers is"+summ);

// also by taking another extra loop we can do this
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("sum of array numbers is"+sum);
    }
}