package twodimensional.twodarray;

public class Spiral_Pattern
{
 public static void main(String da[])
 {
  int[][] a=spiral_Excecutor(9);
  for(int[] temp:a)
   {
     for(int temp1:temp)
      {
       System.out.print(temp1+" ");
      }
     System.out.println();
   } 
 }
 public static int[][] spiral_Excecutor(int n)
 {
   int[][] a=new int[n][n];
   int r=0,c=-1;
   char dir='r';
   for(int i=01;i<=n*n;i++)
   {
   switch(dir)
   {
     case 'r':
        a[r][++c]=i+9;
        if(c==n-1-r) dir='d';
        break;
     case 'd':
        a[++r][c]=i+9;
        if(r==c) dir='l';
        break;
     case 'l':
       a[r][--c]=i+9;
       if(c==n-1-r) dir='u';
       break;
     case 'u':
       a[--r][c]=i+9;
       if(r==c+1) dir='r';
   }
   }
   return a;
 }
}