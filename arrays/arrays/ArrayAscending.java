package arrays.arrays;

import java.util.Scanner;
class ArrayAscending
{
     void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements to array");
        for(int k2=0;k2<size;k2++)
        {
            array[k2]=sc.nextInt();
        }
        for(int k=0;k<size-1;k++)
        {
            for(int l=0;l<=size-1;)
            {
                int min=array[l];
                if(array[l]>array[l+1])
                {
                    int temp=
                            array[l] =array[l+1];
                    array[l+1]=temp;
                    l++;
                }

            }

        }
        for(int k1=0;k1<size;k1++)
        {
            System.out.print(" "+array[k1]);
        }


    }

}