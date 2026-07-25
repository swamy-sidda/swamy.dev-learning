package strings;

public class ReverseString {
     static void main(String sh[])
    {
      System.out.println(reverseString("kumarswamy madanapalli"));
    }
    public static String  reverseString(String str)
    {
        if(str==null||str.length()==1) return str;
        return reverseString(str.substring(1))+str.charAt(0);
    }
}