package patterns;

public class ButterflyPattern {
     static void main(String[] args) {
        print(10);
    }
    public static void print(int n)
    {
        int stars=1;
        int spaces=n*2-3;
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            if(stars==n)
            {
                for(int j=1;j<stars;j++)
                {
                    System.out.print("*");
                }
            }else {
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
            }
            if(i<n){
                spaces-=2;
                stars++;
//                if(i==n-1){
//                    stars-=1;
//                }
            }
            else {
                spaces+=2;
                stars--;
            }
            System.out.println();
            }

        }
    }

