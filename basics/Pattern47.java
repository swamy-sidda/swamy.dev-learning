
public class Pattern47
{
    public static void main(String sf[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int stars=1;
        for(int i=1;i<n*2;i++)
        {
            for(int j=1;j<=stars;j++)
                System.out.print("*");


            if(i<n)
                stars++;
            else
                stars--;
            System.out.println();

        }
    }
}