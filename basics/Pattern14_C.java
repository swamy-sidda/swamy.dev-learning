
public class Pattern14_C
{
    public static void main(String ds[])
    {
        print(5);
    }
    public static void print(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}