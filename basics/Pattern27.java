
public class Pattern27
{
    public static void main(String fd[])
    {
        print(5);
    }
    public static void print(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                if(j%2!=0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();

        }
    }

}