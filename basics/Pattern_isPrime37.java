
public class Pattern_isPrime37
{
    public static void main(String fd[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int num=11;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i+1;k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i||i==n)
                {
                    while(isPrime(num)==false)
                    {
                        num++;
                    }
                    System.out.print(num+" ");
                    num++;
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int num)
    {
        if(num<=10) return false;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
}
