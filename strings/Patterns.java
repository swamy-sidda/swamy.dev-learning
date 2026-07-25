package strings;

import java.util.Scanner;
class Patterns
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        display(num);

    }
/*static void display(int n)
{
 for(int i=1;i<=n;i++)
 {
  for(int j=1;j<=n-i;j++)
  {
   System.out.print(" ");
  }
 for(int k=1;k<=i;k++)
 {
     System.out.print("* ");
 }
 System.out.println();
 }
}

static void display(int n)
{
 for(int i=n;i>0;i--)
 {
  for(int j=1;j<=n-i;j++)
  {
   System.out.print("  ");
  }
 for(int k=1;k<=i;k++)
 {
     System.out.print("* ");
 }
 System.out.println();
 }
}

static void display(int n)
{
 for(int i=1;i<=n;i++)
 {
  for(int j=1;j<=n;j++)
  {
   if(i==1||i==n||j==1||j==n)
    System.out.print("* ");
   else
    System.out.print("  ");
  }
 System.out.println();
 }
}
static void display(int n)
{
 for(int i=1;i<=n;i++)
 {
  for(int j=1;j<=n;j++)
  {
   if(i==j||i+j==n+1)
    System.out.print("* ");
   else
    System.out.print("  ");
  }
 System.out.println();
 }
}*/


    static void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }



}