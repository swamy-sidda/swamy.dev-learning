package patterns;

public class Vertical {
     static void main(String[] args) {
     print(5);
    }
    public static void print(int n)
    {
        int spaces=1;
        int stars=n*2-1;
        for(int i=1;i<=n*2-1;i++) {
            int temp=n*2-1;
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(temp--);
            }

            if(i<n){
                spaces++;
                stars-=2;
            }else{
                spaces--;
                stars+=2;
            }
            System.out.println();
        }

    }
}
