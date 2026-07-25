package stack;

import java.util.Stack;
public class LongestParenthesis {
    static void main() {
        System.out.println(longestParentheses("(){}}{[()]}{()()()()}"));
    }
    public static int longestParentheses(String s) {
        int max=0;
        if(s==null||s.length()==1) return  max;
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
                stack.push(s.charAt(i));
                count++;
            }
            else if(!stack.isEmpty()&& ((s.charAt(i)==')'&&stack.peek()=='(')||(s.charAt(i)=='}'&&stack.peek()=='{')
            ||(s.charAt(i)==']'&&stack.peek()=='['))) {
                stack.pop();
                count++;
                if(max<count && count%2==0) max=count;
            }
            else {
                if(max<count && count%2==0) max=count;
                count=0;
                while(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        if(max<count && count%2==0) max=count;
        return max;
    }
}
