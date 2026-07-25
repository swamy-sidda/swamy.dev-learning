package patterns;

public class Diamond {
     static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        int stars = 1;
        int spaces = n ;
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            if (i <n) {
                spaces = spaces - 1;
                stars = stars + 2;
            } else {
                spaces = spaces + 1;
                stars = stars - 2;
            }
            System.out.println();
        }
    }
}

