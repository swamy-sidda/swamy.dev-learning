public class Star
{
    public static void main(String ad[])
    {
        print(4);
    }
    public static void print(int m)
    {
        int n=m*5;
        int spaces=(m/2)+(m*2-1)+1;
        int nsp=1;
        int stars=n;

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<spaces;j++)
                System.out.print(" ");
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<nsp;j++)
                System.out.print(" ");
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            nsp+=1;
            stars-=2;
            System.out.println();
        }

        int spa=m;
        int st=12;
        for(int i=1;i<=m/2;i++)
        {
            for(int j=1;j<=spa;j++)
                System.out.print(" ");
            for(int j=1;j<=st;j++)
                System.out.print("*");
            spa++;
            st-=2;
            System.out.println();
        }

        int s=m+2;
        int sp=1;
        int str=m*2/2;
        for(int i=1;i<=m+m/2;i++)
        {
            for(int j=1;j<=s;j++)
                System.out.print(" ");
            for(int j=1;j<=str;j++)
                System.out.print("*");
            for(int j=1;j<sp;j++)
                System.out.print(" ");
            for(int j=1;j<=str;j++)
                System.out.print("*");
            sp+=2;
            str--;
            System.out.println();
        }
    }
}