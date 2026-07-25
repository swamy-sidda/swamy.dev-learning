package twodimensional.twodarray;

import java.util.Scanner;

public class ArrayDemo3
{
public static void main(String as[])
{
 Scanner sc=new Scanner(System.in);
 int[][] array=new int[4][3];
 for(int i=0;i<array.length;i++)
 {
   System.out.println("enter elements to "+(i+1)+" row");
  for(int j=0;j<array[i].length;j++)
  {
    array[i][j]=sc.nextInt();
  }
 }
 System.out.println("initial Array is :");
 printer(array);
int[][] array1=new int[3][4];
for(int i=0;i<array1.length;i++)
 {
  for(int j=0;j<array1[i].length;j++)
  {
   array1[i][j]=array[j][i];
  }  
 }
 System.out.println("transpose of initial array is :");
 printer(array1);
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
