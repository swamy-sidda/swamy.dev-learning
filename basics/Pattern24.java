
import java.util.Scanner;
class Pattern24
{
    static public  void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        printPattern(n);
    }
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=i;space++)
            {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
