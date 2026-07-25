package patterns;

public class Patterns1 {
     static void main(String[] args) {
      print(5);
    }
    public static void print(int a){
        for(int i=1;i<=a;i++)
        {
            int num=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                System.out.print(" ");
                num=num+a-j;
            }
            System.out.println();
        }
    }
}
