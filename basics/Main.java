package basics;

import java.util.Scanner;

class a {
    public static void m1()
    {
        System.out.println(" A class method /super class  ");
    }
}
class b extends a
{
    public static void m1()
    {
        System.out.println("B class method/ sub class " );

    }
}
public class Main{
     static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        a s1=new b();
        b s2=new b();
        s1.m1();
        s2.m1();
        a.m1();
        b.m1();
    }
}