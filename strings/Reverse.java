package strings;

class Reverse
{
    public static void main(String ar[])
    {
        String str="developer";
        String s="";
        char[] a=str.toCharArray();
        int i=0,j=a.length-1;
        while(i<j)
        {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(char c:a)
            System.out.print(c);
    }
}