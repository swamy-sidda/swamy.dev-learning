package basics;

public class Pattern10A
{
    public static void main(String sd[])
    {
        print(5);
    }
    public static void print(int n)
    {
        if(n<3)
            n=3;
        int spaces=n*2;
        for(int i=0;i<=n*2;i++)
        {
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1||j==i||j==1||i==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            spaces--;
            System.out.println();
        }
    }
}
