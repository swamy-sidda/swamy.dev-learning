
public class Pattern46
{
    public static void main(String jk[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int stars=n;
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<=stars;j++)
            {
                if(j==1||j==stars||i==1||i==n*2-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if(i<n)
                stars--;
            else
                stars++;
            System.out.println();
        }
    }
}
