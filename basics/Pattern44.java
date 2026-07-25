
import java.util.Scanner;
class Pattern44
{
    public static void main(String at[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
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
    public static boolean isPrime(int num)
    {
        if(num<2) return false;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
}
