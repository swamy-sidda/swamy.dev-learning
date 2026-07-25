
public class Pattern20_R
{
    public static void main(String ar[])
    {
        print(4);
    }
    public static void print(int n)
    {
        int m=n*2-1;
        int stars=n+1;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=stars;j++)
            {
                if(i==1||j==1||j==stars||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(i==n) stars=3;
            if(i>n) stars++;
            System.out.println();
        }
    }
}