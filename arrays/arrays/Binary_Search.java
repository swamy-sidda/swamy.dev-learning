package arrays.arrays;

public class Binary_Search
{
    public static void main(String fh[])
    {
        int[] a={1,2,3,4,5,6,10,20,30,40};
        if(search(a,60))
            System.out.println("Available");
        else
            System.out.println("not available");
    }
    public static boolean search(int []a,int n)
    {
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==n) return true;
            if(n<a[mid]) end=mid-1;
            if(n>a[mid]) start=mid+1;
        }
        return false;
    }
}