package twodimensional.twodarray;

public class ArrayDemo2
{
public static void main(String af[])
{
 int[][] array={{1,2,3},{4,5,6,7},{7,8,9,8,0}};
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