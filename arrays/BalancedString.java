package arrays;

public class BalancedString {
     static void main(String[] args) {
        String str="{}[]{}";
        System.out.println( isBalanced(str));
    }
    public static boolean isBalanced(String str){
        char[] arr=new char[str.length()];
        int k=0;
        for(int i=0;i<arr.length;i++){
            char ch=str.charAt(i);
           if(ch=='{' || ch=='[' || ch=='('){
             arr[k++]=ch;
           }
           else  if(arr[0]!='\u0000'){
               if(ch=='}'&&arr[k-1]!='{' || ch==']'&&arr[k-1]!='[' || ch==')'&&arr[k-1]!='('){
                  return false;
               }
               else{
                   k--;
               }
           }
        }
        return true;
    }
}
