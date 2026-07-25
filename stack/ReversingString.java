package stack;

public class ReversingString {
    static void main() {
        java.util.Stack<String> stack = new java.util.Stack<String>();
        System.out.println(reverse("kumarswamy",0,stack));
    }
    public static String reverse(String str,int index,java.util.Stack<String> stack){
        stack.push(str.charAt(index)+"");
        if(index==str.length()-1){
           return stack.pop();
        }
        return reverse(str,index+1,stack)+stack.pop();
    }
}
