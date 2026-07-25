package strings;

public class ReverseManual {
    public static void main(String[] args) {
        String str1=" "+" "+" "+" "+" "+" "+"kumar swamy from madanapalli andhrapradesh"+" "+" "+" ";
        test2(str1+" ");
    }
    public static void test2(String str1) {
       int i=0,j=0,pointer=0;
       while(i<str1.length()){
           if(str1.charAt(i)!=' '){
               i++;
               j=i-1;
               continue;
           }
           if(j>=pointer){
              System.out.print(str1.charAt(j));
              if(j==pointer&&i<str1.length()-2) System.out.print(" ");
              --j;
              continue;
           }
           i++;
           pointer=i;
       }
       System.out.println();
    }
}
