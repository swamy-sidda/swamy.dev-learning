package basics;

import java.util.Scanner;
public class ASCII
{
    public static void main(String ae[])
    {
        char[] a={'a','A','0','9','z','Z','!','='};
        for(int i=0;i<a.length;i++)
        {
            System.out.print((int)a[i]);
            System.out.println("  "+a[i]);
        }
    }
}
