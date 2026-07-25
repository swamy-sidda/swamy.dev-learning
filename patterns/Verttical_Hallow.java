package patterns;

public class Verttical_Hallow {
     static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
       int spaces=1;
       int stars=n*2-1;
       for(int i=1;i<=n*2-1;i++){
           for(int j1=1;j1<spaces;j1++){
               System.out.print("  ");
           }
           for(int j=1;j<=stars;j++) {
               if (j == 1 || j == stars || i == 1 || i == n * 2 - 1) {
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
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
