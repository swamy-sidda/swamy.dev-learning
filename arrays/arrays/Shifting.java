package arrays.arrays;

public class Shifting
{
    public static void main(String h[])
    {
        int[] a={1,2,3,4,5,6};
        iterator(a,2);
    }
    public static void iterator(int a[],int count)
    {
        int i=0,j=a.length-1;

        while(count>0)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
            count--;
        }
        for(int l=0;l<a.length;l++)
        {
            System.out.println(a[l]);
        }
    }
}