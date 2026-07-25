
import java.util.Scanner;
class Pattern41
{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        display(n);

    }
    public static void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
