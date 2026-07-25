package twodimensional.twodarray;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String ad[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int[][] a = helper_Method(n);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] helper_Method(int n) {
        int[][] a = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        return a;
    }
}