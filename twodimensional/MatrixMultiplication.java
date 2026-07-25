package twodimensional;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String hj[])
    {
        int[][] a={{1,1,1},{1,1,1},{1,1,1}};
        int[][] b={{1,1,1},{1,1,1},{1,1,1}};
        int[][] c=multiply(a,b);
        for(int[] v:c)
        {
            System.out.println(Arrays.toString(v));
        }
    }
    public static int[][] multiply(int[][] a, int[][] b)
    {
        int[][] c=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int k=0;k<b[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
