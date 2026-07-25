
public class Pattern17_H
{
    public static void main(String[] s)
    {
        print(8);
    }
    public static void print(int n)
    {
        if(n%2==0)
            n=n+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==n||j==1||i==(n/2)+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}