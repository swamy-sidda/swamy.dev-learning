package arrays.arrays;

import java.util.Arrays;
public class Merge
{
     void main(String as[])
    {
        int arr[]={1,3,5,2,4,9,6,7,0,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        if(arr.length==1) return;
        int[] a=new int[arr.length/2];
        int[] b=new int[arr.length-a.length];

        int i=0;
        while(i<a.length)
        {
            a[i]=arr[i];
            i++;
        }
        int j=0;
        while(j<b.length)
        {
            b[j]=arr[i];
            j++;
            i++;
        }
        sort(a);
        sort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a,int[] b,int[] c)
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){c[k]=a[i];i++;k++;}
        while(j<b.length) {c[k]=b[j];j++;k++;}

    }
}