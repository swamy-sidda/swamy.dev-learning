
import java.util.Scanner;
class Pattern42
{
    public static void main(String at[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        display(n);

    }
    public static void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
