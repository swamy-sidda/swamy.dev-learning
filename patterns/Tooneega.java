package patterns;

public class Tooneega {
         static void main(String ar[])
        {
            print(6);
        }
        public static void print(int n) {
            int sec = n;
            int sp = n;
            int temp = n;
            int spaces = 1;
            int stars = n;
            for (int i = 1; i <= n * 2 - 1; i++) {
                for (int j = 1; j < spaces; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= stars; k++) {
                    System.out.print(temp--);
                }
                for (int j = 1; j <= sp; j++) {
                    System.out.print("  ");
                }

                for (int k = stars; k >=1; k--) {
                    System.out.print(1+temp++);
                }
                if (i < n) {
                    spaces++;
                    stars--;
                    sp--;
                } else {
                    spaces--;
                    stars++;
                    sp++;
                }

                temp = n;
                System.out.println();
            }
        }
        }


