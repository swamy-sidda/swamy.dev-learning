
import java.util.Scanner;
class Pattern33
{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++)
            {
                while(isPrime(num)==false)
                {
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
    static public boolean isPrime(int num)
    {
        if(num<2) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
}