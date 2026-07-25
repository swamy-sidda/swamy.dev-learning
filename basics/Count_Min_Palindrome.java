
import java.util.Scanner;

public class Count_Min_Palindrome
{
    public static void main(String cc[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int v1=n1<n2?n1:n2;
        int v2=n1>n2?n1:n2;
        int count=0;

        for(int i=v1;i<=v2;i++)
        {
            int rev=0;
            if(isPalindrome(i,rev)==i)
            {
                count++;
            }
            if(count==3){
                System.out.println(i+" "+" is the third smallest palindrome in the given range");
                break;
            }
        }
    }
    public static int isPalindrome(int n,int rev)
    {
        if(n==0) return rev;
        return isPalindrome(n/10,(rev*10)+n%10);
    }
}