
import java.util.Scanner;
public class Pattern9
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
            for(int j=1;j<=i;j++)
            {
                if(i<n){
                    if(j==1||j==i)
                    {
                        System.out.print((char)(i+96) +" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

                if(i==n&&j==n-1)
                {
                    for(int k=1;k<=i;k++)
                        System.out.print((char)(96+k)+" ");
                }
            }
            System.out.println();
        }
    }
}