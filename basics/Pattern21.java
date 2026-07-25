
import java.util.Scanner;
class Pattern21
{
    static public  void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        executor(n);
    }
    static void executor(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
