
import java.util.Scanner;
class Pattern25
{
    static public void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        display(n);
    }
    static void display(int n)
    {
        for(int i=n;i>=0;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
