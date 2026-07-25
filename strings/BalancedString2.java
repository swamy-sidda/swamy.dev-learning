package strings;

import java.util.Stack;

public class BalancedString2
{
    public static void main(String[] jkl)
    {
      System.out.println(isBalanced("{}[{]()}"));
    }
    public static boolean isBalanced(String st)
    {
        String str=balance(st);
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
            {
                stk.push(ch);
            } else if ((!stk.isEmpty()&&(
                     ch == '}' && stk.peek() == '{'
                    || ch == ']' && stk.peek() == '['
                    || ch == ')' && stk.peek() == '(')))
            {
                stk.pop();
            } else
            {
                stk.push(ch);
            }
        }
        return stk.isEmpty();
    }
    public static String  balance(String str)
    {
      StringBuilder st= new StringBuilder();
      for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(ch=='{' || ch == '[' || ch == '('||ch=='}'||ch==']'||ch==')')
          {
              st.append(ch);
          }

      }
      return st.toString();
    }
}
