
import java.util.Scanner;
public class PrimePalindrome
{
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int v1=n1<n2?n1:n2;
        int v2=n1>n2?n1:n2;

        for(int i=v1;i<=v2;i++)
        {
            if(isPrime(i)&&isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n)
    {
        if(n<=1) return false;
        int rev=0;
        int temp=n;
        while(temp>0)
        {
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
}




