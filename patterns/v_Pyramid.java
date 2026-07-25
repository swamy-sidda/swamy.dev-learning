package patterns;

public class v_Pyramid {
     static void main(String[] args) {
            print(5);
    }
    public static void print(int n){
        int s=1;
        for(int i=n;i>=1;i--){
            int num=i+n-s++;
            for(int j1=1;j1<=s-1;j1++){
                System.out.print("  ");
            }
          for(int j=1;j<=num;j++){
              System.out.print("* ");
          }
          System.out.println();
        }

    }
}
