
public class Pattern28
{
    public static void main(String as[])
    {
        print(5);
    }
    public static void print(int n)
    {
        char c='A';
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                if(i==1||j==1||j==n-i+1)
                {
                    System.out.print(c+++" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}