
import java.util.Scanner;
public class Pattern8
{
    static char c=97;
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
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i||i==n)
                {
                    System.out.print(c++ +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}