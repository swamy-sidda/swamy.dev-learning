
class Pattern_A
{
    public static void main(String as[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-(n-i+1);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1||j==1||i==n||i==n/2)
                {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
}
