
public class Pattern40
{
    public static void main(String ad[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int spaces=1;
        int stars=n;
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<spaces;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++)
            {
                if(j==1||j==stars||i==1||i==n*2-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<n)
            {
                spaces++;
                stars--;
            }
            else{
                spaces--;
                stars++;
            }
            System.out.println();
        }
    }
}