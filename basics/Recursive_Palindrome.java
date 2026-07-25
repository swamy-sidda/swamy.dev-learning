
import java.util.Scanner;
public class Recursive_Palindrome
{
    public static void main(String qq[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        if(isPalindrome(n1,0)==n1)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }
    public static int isPalindrome(int n,int rev)
    {
        if(n==0)
            return rev;
        return isPalindrome(n/10,(rev*10)+n%10);
    }
}













