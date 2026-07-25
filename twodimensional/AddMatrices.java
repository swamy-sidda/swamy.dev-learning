package twodimensional;

public class AddMatrices {
    public static void main(String dfg[])
    {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
     int[][] c= addElements(a,b);
     for(int[] z:c)
     {
       for(int g:z)
       {
           System.out.print(g+" ");
       }
       System.out.println();
     }
    }
    public static int[][] addElements(int[][] a,int[][] b)
    {
        int[][] c=new int[a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
         for(int j=0;j<a[i].length;j++)
         {
             c[i][j]=a[i][j]+b[i][j];
         }
            System.out.println();
        }
        return c;
    }
}
