
public class Pattern39
{
    public static void main(String ar[])
    {
        print(6);
    }
    public static void print(int n)
    {
        int temp=n;
        int spaces=1;
        int stars=n;
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++)
            {
                System.out.print(temp--);
            }
            if(i<n)
            {
                spaces++;
                stars--;
            }
            else
            {
                spaces--;
                stars++;
            }
            temp=n;
            System.out.println();
        }
    }
}