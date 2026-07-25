
import java.util.Scanner;
class Pattern1
{
    static int temp=0;
    public static void main(String[] art)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        pattern1(n);
    }

    static void pattern1(int n)
    {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {

                System.out.print(++temp+"  ");

            }
            System.out.println();
        }
    }
}



