
import java.util.Scanner;
class Pattern4
{
    static int temp=1;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int rows=sc.nextInt();
        int count=0,num=2;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                while(isPrime(num)==false)
                {
                    num++;
                }
                System.out.print(num+"  ");
                num++;
            }
            System.out.println();
        }
    }

    static boolean isPrime(int n)
    {
        if(n<2) return false;
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0) return false;
            }
            return true;
        }
    }
}