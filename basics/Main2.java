package basics;

public class Main2 {
     static void main(String[] args){
      short s=10;
      short w=20;
      sum(s,w);
      sum2((byte)s,(byte)w);
    }
    public static void sum(int a,int b){
       System.out.println(a+b);
    }
    public static void sum2(byte a,int b){
        System.out.println(a+b);
    }
}
