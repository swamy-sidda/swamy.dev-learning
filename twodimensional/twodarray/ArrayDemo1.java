package twodimensional.twodarray;

import java.util.Scanner;

public class ArrayDemo1
{
public static void main(String af[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the row size");
 int row=sc.nextInt();
 System.out.println("enter the column size");
 int col=sc.nextInt();
 int[][] array=new int[row][col];
 for(int i=0;i<array.length;i++)
 {
  System.out.println("enter elements to "+i+" row ");
  for(int j=0;j<array[i].length;j++)
  {
    array[i][j]=sc.nextInt();
  }
  System.out.println();
 } 
 printer(array);
}


 public static void printer(int[][] a)
 {
  for(int i=0;i<a.length;i++)
  {
    for(int j=0;j<a[i].length;j++)
    {
     System.out.print(a[i][j]+" ");
    }
   System.out.println();
  }
 }
}