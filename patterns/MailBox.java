package patterns;

public class MailBox {
     static void main(String[] args) {
        print(20);
    }
    public static void print(int m) {
        int n;
        if (m%2==0)
            n=m+1;
        else n=m;



      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=n;j++) {

              if(i<=n/2+1) {
                  if (j == 1 || j == n || i == 1 || i == n || j == i || i + j == n + 1) {
                      System.out.print("* ");
              }else{
                      System.out.print("  ");
                  }
              } else {
                  if (j == 1 || i == 1 || i == n || j==n ) {
                      System.out.print("* ");
                  } else {
                      System.out.print("  ");
                  }
              }
          }
          System.out.println();
          }

      }
    }

