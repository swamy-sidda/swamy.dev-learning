package patterns;

public class Octagone {
     static void main(String[] args) {
     print(6);
    }
    public static void print(int n) {
        int stars = 3;
        int spaces = n - 2;
        for (int i = 1; i <=n * 2 - 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                if(i==1||i==n*2-2||j==1||j==stars) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            if (i < n - 1 && i < n / 2 + 1) {
                stars += 2;
                spaces--;
            } else if (i > n / 2 && i <= n / 2 + 2) {
                stars = n * 2 - 1;
                spaces = 0;
            } else {
                stars -= 2;
                spaces++;
            }
            System.out.println();

        }
    }
}


