package strings;

import java.sql.SQLOutput;

public class BalancedString3 {
    public static void main(String[] args) {

        System.out.println(isBalanced("kumar ({[})}]{ swamy"));
    }
    public static boolean isBalanced(String str) {
     String st=characterSet(str);
        System.out.println(st);
     int leftCount=0;
     int rightCount=0;
     for(int i=0;i<st.length();i++)
     {
         char ch=st.charAt(i);
         if(leftCount<rightCount)
             return false;
             if(ch=='{' || ch=='[' || ch=='(')
                 leftCount++;
         if(ch=='}' || ch==']' || ch==')')
             rightCount++;
     }
    return leftCount==rightCount;
    }
    public static String characterSet(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c =='{'||c=='}'||c==']'||c=='['||c=='('||c==')')
              sb= sb.append(c);
        }
        return sb.toString();
    }
}
