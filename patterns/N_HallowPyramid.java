package patterns;

public class N_HallowPyramid {
     static void main(String[] args) {
     print(5);
    }
    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j1=1;j1<=n-i;j1++){
                System.out.print("  ");
            }
            int num=i+i-1;
            for(int j=1;j<=num;j++){
                if(j==1||j==num||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
