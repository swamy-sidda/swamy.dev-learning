package twodimensional.twodarray;

public class Second_Maxxx
{
public static void main(String fg[])
{
 int[][] a={{87,23,45,67,87,34},{23,34,54,67,89,94},{12,45,6,7,67}};
  System.out.println(search(a));
}
public static int search(int[][] a)
{
 int max=a[0][0];
 int sec=a[0][0];
 for(int i=0;i<a.length;i++)
 {
  for(int j=0;j<a[i].length;j++)
  {
   if(a[i][j]>max)
   {
    sec=max;
    max=a[i][j];
    continue;
   } 
   if(a[i][j]<max && a[i][j]>sec)
   {
     sec=a[i][j];
   }
  }
 }
 return sec;
}
}