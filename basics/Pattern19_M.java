
public class Pattern19_M
{
    public static void main(String dd[])
    {
        print(8);
    }
    public static void print(int n)
    {
        if(n%2==0)
            n=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==1||j==n||(i==j && i<=n/2+1)||(i+j==n+1 && i<=n/2+1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}