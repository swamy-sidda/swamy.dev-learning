
import java.util.Scanner;
class ArmStrong_Number
{
    public static void main(String af[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(isArmstrong(i)==i)
                System.out.println(i+"is ArmStrong");
            else
                System.out.println(isArmstrong(i)+"------");
        }
    }
    public static int isArmstrong(int n)
    {
        String s=""+n;
        int sum=0;
        int len=s.length();
        int temp=0;
        return isCompare(n,len,sum,temp);
    }
    public static int isCompare(int n,int l,int sum,int temp)
    {
        sum+=temp;
        if(n==0)
            return sum;
        temp=0;
        temp+=(int)Math.pow(n%10,l);
        return temp+isCompare(n/10,l,sum,temp);
    }
}