package arrays.arrays;

import java.util.Scanner;
class MaxMinArray
{
     void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size] ;
        int i;
        System.out.println("enter the elements to the array");
        for(i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int min=array[0];
        int max=array[0];
        for(i=0;i<size;i++)
        {
            if(min>array[i])
                min=array[i];
            if(max<array[i])
                max=array[i];
        }
        System.out.println("array elements are");
        for(int j=0;j<size;j++)
        {
            System.out.print(" "+array[j]);

        }
        System.out.println();

        System.out.println("the small number is "+min);
        System.out.println("the large number is"+max);



    }
}







