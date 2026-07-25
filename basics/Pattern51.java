
import java.util.Scanner;
public class Pattern51
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
                System.out.print(" ");
            }
            for(int j=n;j>=i+(i-1);j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}