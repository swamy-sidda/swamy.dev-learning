
public class Pattern16_G
{
    public static void main(String kl[])
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
                if(i<m)
                {
                    if(i==1||j==1) System.out.print("*");
                    else System.out.print(" ");
                }
                else
                {
                    if(i==1||j==1||i==n||j==n||i==m) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}