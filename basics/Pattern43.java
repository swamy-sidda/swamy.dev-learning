
import java.util.Scanner;
class Pattern43
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
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
