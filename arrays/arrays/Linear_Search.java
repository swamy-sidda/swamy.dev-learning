package arrays.arrays;

class Linear_Search
{
    public static void main(String fa[])
    {
        int[] a={10,3,4,6,7,89,4,2,6,7,8};
        if(linearSearch(a,7))
            System.out.println("number found");
        else
            System.out.println("number not found");
    }
    public static boolean linearSearch(int[] a,int n)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==n) return true;
        }
        return false;
    }
}