package arrays.arrays;

public class Binary_Recursion
{
    public static void main(String as[])
    {
        int[] a={12,13,14,15,16,17,18,19};
        if(search(a,123,0,a.length-1))
            System.out.println("available");
        else
            System.out.println("not available");
    }
    public static boolean search(int a[],int n,int start,int end)
    {
        if(start>end) return false;
        int mid=(start+end)/2;
        if(a[mid]==n) return true;
        if(n<a[mid]) return search(a,n,start,mid-1);
        else
            return search(a,n,mid+1,mid);
    }
}