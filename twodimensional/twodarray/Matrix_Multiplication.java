package twodimensional.twodarray;

public class Matrix_Multiplication
{
 public static void main(String ad[])
 {
  int[][] a={{1,2,3},{1,2,3},{1,2,3}};
  int[][] b={{1,2,3},{1,2,3},{1,2,3}};
  
  int[][] c=multiplyer(a,b);
  for(int[] temp:c)
  {
   for(int n:temp)
   {
    System.out.print(n+" ");
   }
    System.out.println();
  }

 }
static int[][] multiplyer(int[][] a,int[][] b)
{
  int size=a.length;
  int[][] c=new int[size][size];
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
     for(int k=0;k<size;k++)
     {
      c[i][j]+=a[i][k]*b[k][j];
     }
   }
  }
   return c;
}
}