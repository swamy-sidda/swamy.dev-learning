package stack;

import java.util.Stack;

public class StringReverse {
     static void main(String[] args) {
    System.out.println(reverseString("ardahbareev"));
        System.out.println(reverseString("ardahb"));
    }
    public static StringBuilder reverseString(String s){
        StringBuilder sb=new StringBuilder();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
           stack.push(s.charAt(i)+"");
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb;
    }
}
