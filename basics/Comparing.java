package basics;

public class Comparing {
     static void main(String[] ar) {
       StringBuilder sb=new StringBuilder("KUMAR");
       StringBuffer sb1=new StringBuffer("KUMAR");
       StringBuffer sb2=new StringBuffer("kumar");

       System.out.println(sb.toString().equals(sb1.toString()));
       System.out.println(sb.toString().equalsIgnoreCase(sb2.toString()));
       System.out.println(sb.equals(sb1));
       System.out.println(sb.equals(sb2));
    }
}
