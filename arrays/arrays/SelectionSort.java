package arrays.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        selection_sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void selection_sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[index])
                {
                    index=j;
                }
            }
            if(i!=index)
            {
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }
        }
    }
}