
public class Fibonacci
{
    public static void main(String ad[])
    {
        helper(-150);
    }
    public static void fibonacci(int i,int j,int n)
    {
        int c=i+j;
        if(c>=n) return;
        System.out.println(c);
        fibonacci(j,c,n);
    }
    public static void helper(int n)
    {
        fibonacci(0,1,n);
    }
}