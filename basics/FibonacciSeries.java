package basics;

public class FibonacciSeries {
     static void main() {
        fibonacci(1,25);
    }
    public static void  fibonacci(int n,int m){
        int i=0;
        int j=1;
        int c=0;
        while(c<m){
           c=i+j;
           if(c>=n&&c<=m){
               System.out.println(c);
           }
           i=j;
           j=c;
        }
    }
}
