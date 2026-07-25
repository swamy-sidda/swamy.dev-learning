
public class Pattern13_8
{
    public static void main(String ds[])
    {
        print(5);
    }
    public static void print(int m)
    {
        int n=m*2-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||i==m||j==1||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}