package wrapper;

public class Wrapper_values
{
    public static void main(String af[])
    {
        Integer[] n=new Integer[5];
        n[0]=new Integer("10");//implicit conversion
        n[1]=new Integer("13");
        n[2]=new Integer(12);
        n[3]=new Integer(13);//implicit conversion
        n[4]=new Integer(12);
        for(int i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
    }
}