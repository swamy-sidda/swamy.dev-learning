
public class Pattern49
{
    public static void main(String ad[])
    {
        print(5);
    }
    public static void print(int n)
    {
        int stars=1;
        int spaces=n-1;
        for(int i=1;i<n*2;i++)
        {
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
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