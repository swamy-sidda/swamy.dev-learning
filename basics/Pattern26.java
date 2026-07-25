
import java.util.Scanner;
public class Pattern26
{
    public static void main(String ag[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        printer(n);
    }
    public static void printer(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=i-1;sp++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                if(j==1||j==n-i+1||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}