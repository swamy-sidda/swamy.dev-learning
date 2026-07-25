
public class Pattern18_K
{
    public static void main(String[] df)
    {
        print(5);
    }
    public static void print(int n)
    {
        int m=n*2-1;
        int stars=n+1;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=stars+1;j++)
            {
                if(j==1||j==stars) System.out.print("*");
                else System.out.print(" ");
            }
            if(i<n) --stars;
            else ++stars;
            System.out.println();
        }
    }
}