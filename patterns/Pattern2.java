package patterns;

public class Pattern2 {
     static void main(String[] args) {
       print(5);
    }
    public static void print(int n) {
       for (int i = 1; i <= n; i++) {
           int temp=n;
           for(int k=1;k<i;k++){
               System.out.print("  ");
           }
           for(int j=1;j<=n+1-i;j++){
             System.out.print(temp--+" ");
           }
           System.out.println();
       }
    }
}
