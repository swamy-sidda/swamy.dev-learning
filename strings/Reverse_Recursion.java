package strings;

public class Reverse_Recursion {
    public static void main(String[] args) {
      reverse("kumar swamy");
    }
    public static void reverse(char[] s,int start,int end)
    {
      if(start>=end) {
          System.out.println(new String(s));
          return;
      }
      char temp=s[start];
      s[start]=s[end];
      s[end]=temp;
       reverse(s,start+1,end-1);
    }
    public  static void reverse(String s)
    {
        char[] c=s.toCharArray();
        reverse(c,0,c.length-1);
    }
}
