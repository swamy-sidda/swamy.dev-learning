package patterns;

public class N_Pyramid {
     static void main(String[] args) {
       print(5);
    }
    public static void print(int n) {
      for (int i = 1; i <= n; i++) {
          int num=i;
          for(int k=1;k<=n-i;k++){
              System.out.print(" ");
          }
          for(int j=1;j<=i+i-1;j++){
              if(j<=i)
                  System.out.print(j);
              else
                  System.out.print(--num);
          }
          System.out.println();
      }
    }
}