
import java.util.Scanner;
class Pattern3
{
    static int temp=1;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        executor(n);
    }

    static void executor(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(temp+"  ");
                temp+=2;
            }
            System.out.println();
        }
    }
}