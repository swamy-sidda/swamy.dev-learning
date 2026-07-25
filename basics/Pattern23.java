
import java.util.Scanner;
class Pattern23
{
    static public  void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=10;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print("   ");
            }
            for(int j=i;j<=n;j++)
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
    static boolean isPrime(int n)
    {
        if(n<2) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%2==0) return false;
        }
        return true;
    }
}
