package arrays.arrays;

import java.util.Scanner;
import java.util.Arrays;
class MergeSort
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arry");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter elements to array");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("sorted array is :");
        sorting(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sorting(int[] a)
    {
        if(a.length==1) return;
        int[] left =new int[a.length/2];
        int[] right=new int[a.length-left.length];
        int i=0;
        while(i<left.length)
        {
            left[i]=a[i];
            i++;
        }
        int j=0;
        while(j<right.length)
        {
            right[j]=a[i];
            i++;
            j++;
        }
        sorting(left);
        sorting(right);
        merge(left,right,a);
    }
    public static void merge(int[] left,int[] right,int[] copy)
    {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]>right[j])
            {
                copy[k]=left[i];
                k++;
                i++;
            }
            else{
                copy[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length)
        {
            copy[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            copy[k]=right[j];
            k++;
            j++;
        }
    }
}





