package basics;

public class Static {
    static int spaces ;
    static {
          System.out.println("Spaces UpdAted 1");
         spaces = 11;
    }

     static void main(String[] args) {
         System.out.println(spaces);
    }
    static{
         System.out.println("Spaces UpdAted 2");
        spaces = 30;
    }
    static{
      int  spaces = 20;
       System.out.println(" static block variable "+spaces);
    }
}
