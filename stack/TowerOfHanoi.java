package stack;

import java.util.Stack;

public class TowerOfHanoi {
   public static void main(String[] args) {
       Stack<Integer> a = new Stack<>();
       a.add(5);
       a.add(4);
       a.add(3);
       a.add(2);
       a.add(1);
       Stack<Integer> b = new Stack<>();
       Stack<Integer> c = new Stack<>();

       System.out.println(a);
     towerOfHanoi(5,a,b,c);

     System.out.println(c);
   }
   public static void towerOfHanoi(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){
       if(n==1){
           c.push(a.pop());
           return;
       }
       towerOfHanoi(n-1,a,c,b);
       c.push(a.pop());
       towerOfHanoi(n-1,b,a,c);
   }
}
