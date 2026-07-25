package strings;

import java.util.Stack;

public class PossiblePalindrome {
    public static void main(String[] args) {
      print("Kumarasamy is good boy");
    }
    public static void print(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
            if(palindrome(str.substring(i, j+1))){
                System.out.println(str.substring(i, j+1));
            }
            }
        }
    }
    public static boolean palindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

