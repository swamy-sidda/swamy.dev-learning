package twodimensional.twodarray;

import java.util.Scanner;
import java.util.Arrays;

public class Char_Array_Demo1
{
 public static void main(String as[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter row number");
  int row=sc.nextInt();
  System.out.println("enter a column number ");
  int col=sc.nextInt();
  char a[][]=new char[row][col];
  for(int i=0;i<a.length;i++) 
  {
   System.out.println("enter "+(i+1)+" row characters");
   for(int j=0;j<a[i].length;j++)
   {
    a[i][j]=sc.next().charAt(0);
   }
  }
  matrixPrinter(a);
 
 }
public static void matrixPrinter(char[][] a)
{
 for(int i=0;i<a.length;i++)
 {
  for(char ch1:a[i])
  {
   System.out.print(ch1+" ");
  }
 System.out.println();
 }
}
}