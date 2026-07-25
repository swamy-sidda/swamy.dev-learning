
public class Pattern50
{
    public static void main(String ff[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int spaces=n-1;
        int stars=1;
        for(int i=1;i<n*2;i++)
        {
            for(int j=1;j<=spaces;j++)
                System.out.print(" ");
            for(int j=1;j<=stars;j++)
            {
                if(j==1||j==stars||i==1||i==n*2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(i<n)
            {
                spaces--;
                stars++;
            }else{
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }
}