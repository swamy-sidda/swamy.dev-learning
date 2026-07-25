package patterns;

public class Pattern_0_1 {
     static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        System.out.print(1+" ");
                    else
                        System.out.print(0+" ");
                }if (i%2 != 0)
                    if (j%2 == 0)
                        System.out.print(0+" ");
                    else
                        System.out.print(1+" ");

            }
            System.out.println();
        }

    }
}
