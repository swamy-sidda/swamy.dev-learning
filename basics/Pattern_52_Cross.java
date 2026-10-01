package basics;

public class Pattern_52_Cross {
    static void main() {
      printPattern(10);
    }
    public static void printPattern(int n) {
        if (n%2==0) n= n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j ||i+j == n+1||j==1||i==1||i==n||j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
