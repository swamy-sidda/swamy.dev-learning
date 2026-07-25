public class Recursive_Prime
{
    public static void main(String bn[])
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(15));
        System.out.println(isPrime(51));
        System.out.println(isPrime(57));
    }
    public static boolean isPrime(int n,int i)
    {
        if(n<=1) return false;
        if(n%i==0) return false;
        if(i>n/2) return true;
        return isPrime(n,i+1);
    }
    public static boolean isPrime(int n)
    {
        return isPrime(n,2);
    }
}
