package stack;

public class HanoiDEmo {
    static int count=1;
  public  static void main(String[] args) {
  hanoi(5,"A","B","C");
    }
    public static void hanoi(int n,String a,String  b,String  c){
      if(n==1){
          System.out.println(count+++" "+a+"--->"+c);
          return;
      }
      hanoi(n-1,a,c,b);
        System.out.println(count+++" "+a+"--->"+c);
        System.out.println("--------------------");
      hanoi(n-1,b,a,c);
    }
}
