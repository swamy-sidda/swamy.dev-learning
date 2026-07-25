
public class Pattern12E
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
                if(i==1||j==1||i==n||i==n*2-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}