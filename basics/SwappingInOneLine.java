package basics;

public class SwappingInOneLine {
   public  static void main(String[] args) {
     int a=10;
     int b=20;
     System.out.println(a+" "+b);
     swap(a,b);
    }
    public static void swap(int a,int b){
        System.out.println((a=a+b-(b=a))+" "+b);
    }
}
