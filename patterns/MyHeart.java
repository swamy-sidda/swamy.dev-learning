package patterns;

public class MyHeart {
     static void main(String[] args) {
        print();
    }
    public static void print()
    {
        int spaces=2;
        int stars=4;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 5; j++) System.out.print("  ");
            {
                for (int j = 1; j <= spaces; j++) System.out.print("  ");
                for (int j = 1; j <= stars; j++) System.out.print("* ");
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                    System.out.print("  ");
                }
                for (int j = 1; j <= stars; j++) System.out.print("* ");
                spaces--;
                stars += 2;
                System.out.println();
            }
        }
            stars = 15;
            spaces = 0;


            for (int i1 = 1; i1 <= 6; i1++) {
                for (int j = 0; j < 5; j++)
                    System.out.print("  ");
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }

                spaces++;
                stars -= 2;
                System.out.println();
            }
        }

}
