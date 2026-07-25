package patterns;

public class ButterflyPattern2 {
     static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        int spaces=n*2-3;
        int stars=1;
        for (int i = 1; i <=n*2-1; i++) {
            for (int j = 1; j <= stars; j++) {
                if(j==1||j==stars){
                    System.out.print("*");
                }
            else{
            System.out.print(" ");
            }
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if(j==1||j==stars){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<n) {
                spaces -= 2;
                stars += 1;

            }else {
                spaces += 2;
                stars -= 1;
            }
            System.out.println();
        }

    }
}
