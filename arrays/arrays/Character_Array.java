package arrays.arrays;

import java.util.Scanner;
public class Character_Array
{
    public static void main(String af[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        char[] array=new char[size];
        System.out.println("enter characters");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.next().charAt(0);
        }
        for(int j=size-1;j>=0;j--)
        {
            System.out.println(array[j]+" "+j);
        }
        System.out.println("second last is "+array[size-2]);
    }
}