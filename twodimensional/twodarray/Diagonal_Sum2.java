package twodimensional.twodarray;

import java.util.Scanner;
public class Diagonal_Sum2
{
public static void main(String sd[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter row number");
 int row=sc.nextInt();
 System.out.println("enter column number");
 int col=sc.nextInt();
 int a[][]=new int[row][col];
 for(int i=0;i<a.length;i++)
 {
  System.out.println("enter" +(i+1)+" row elements");
  for(int j=0;j<a[i].length;j++)
  {
   a[i][j]=sc.nextInt();
  }  
 }
 printer(a);
 int sum=0;
 int len=a.length; 
 for(int i=0;i<a.length;i++)
 {
  sum+=a[i][i];
  if(len%2!=0&&i==len/2) continue;
  sum+=a[i][len-1-i];
 }
  System.out.println("sum of diagonals is"+sum);
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