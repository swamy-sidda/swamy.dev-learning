
public class Pattern35
{
    public static void main(String as[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int num=13;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==n||j==1||j==i)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}