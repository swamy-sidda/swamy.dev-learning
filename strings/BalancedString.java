package strings;

public class BalancedString {
    public static void main(String kl[])
    {
      System.out.println(isBalanced("{ku]im]a(r)swam[[y}"));
    }
     public static boolean  isBalanced(String str)
    {
      int count=0,count1=0;
      for(int i=0;i<str.length();i++)
      {
          char ch=str.charAt(i);
          if(ch=='{'||ch=='['||ch=='(')
          {
              count++;
          }
          if(ch=='}'||ch==']'||ch==')')
          {
              count1++;
          }
      }
      return count==count1;
    }
}
