package arrays.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort
{
     void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements to array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        bubble_sort(a);
        System.out.println("sorted array is :");
        System.out.println(Arrays.toString(a));
    }
    public static void bubble_sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    }
}