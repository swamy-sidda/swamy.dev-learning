
import java.util.Scanner;
class Pattern22
{
    static public  void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        executor(n);
    }
    static void executor(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<i;space++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
