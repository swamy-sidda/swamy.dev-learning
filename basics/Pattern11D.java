package basics;

public class Pattern11D
{
    public static void main(String da[])
    {
        print(5);
    }
    public static void print(int n)
    {
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<=n*2-1;j++)
            {
                if(i==n*2-1||i==1||j==n/2+1||j==n*2-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
