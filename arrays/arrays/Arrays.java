package arrays.arrays;

import java.util.Scanner;    //ARRAYS PROBLEM 1:
class Arrays
{
     void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter of an array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.print("Enter elements to array");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print( " "+array[i]);
        }

    }
}