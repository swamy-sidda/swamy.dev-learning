package patterns;

public class Pattern_0_1_2 {
     static void main(String[] args) {
      print(5);
    }
    public static void print(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
