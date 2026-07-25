package wrapper;

public class Wrapper_Parse_Method
{
    public static void main(String ar[])
    {
        String s="1233";
        int x=Integer.parseInt(s);
        System.out.println(x);
        String s1="123.56";
        float f=Float.parseFloat(s1);
        System.out.println(f);
        String s2="123";
        double b=Double.parseDouble(s2);
        System.out.println(b);

    }
}