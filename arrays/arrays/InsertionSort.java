package arrays.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements to array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        insertion_sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertion_sort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}