
public class Pattern38
{
    public static void main(String ad[])
    {
        print(5);
    }
    public static void print(int n)
    {
        char c='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(c+++" ");
            System.out.println();
        }
    }
}