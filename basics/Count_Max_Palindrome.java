
import java.util.Scanner;
public class Count_Max_Palindrome
{
    public static void main(String qq[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int v1=n1<n2?n1:n2;
        int v2=n1>n2?n1:n2;
        int count=0;
        for(int i=n2;i>=n1;i--)
        {
            if(isPalindrome(i)==true)
            {
                count++;
            }
            if(count==3){
                System.out.println(i);
                break;
            }
        }

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
            System.out.println("good");
        }
        if(rev==n)
            return true;
        else
            return false;
    }
}