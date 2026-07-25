package twodimensional.twodarray;

public class Second_Min
{
public static void main(String sf[])
{
 int[][] a={{17,2,3,4},{5,6,7,8,9},{12,2,3,34,56,}};
 System.out.println(search(a));
}
public static int search(int[][] a)
{
 int min=a[0][0];
 int max=a[0][0];
 for(int i=0;i<a.length;i++)
 {
  for(int j=0;j<a[i].length;j++)
  {
    if(a[i][j]<min)
    {
     max=min;
     min=a[i][j];
     continue;
    }
    if(a[i][j]<max && a[i][j]>min)
    {
     max=a[i][j];
    }
  }
 }
  return max;
} 
}