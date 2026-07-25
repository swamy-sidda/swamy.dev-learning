package patterns;

public class V_HallowPyramid {
     static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        int s=1;
        for(int j=n;j>=1;j--){
            int num=j+n-s;
            for(int i1=1;i1<=s-1;i1++){
             System.out.print("  ");
            }
            for(int i1=1;i1<=num;i1++){
                if(i1==1||i1==num||j==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            s=s+1;
        }

    }
}
