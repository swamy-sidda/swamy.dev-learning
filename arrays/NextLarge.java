package arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextLarge {
     static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        int[] a =iterate(array);
        System.out.println(Arrays.toString(a));    }
    public static int[] iterate(int[] a){
        Stack<Integer> stack = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            if(i==a.length-1) {
                stack.push(a[i]);
                System.out.println("one entered to stack");
                a[i]=-1;
                continue;
            }
            while(!stack.isEmpty()){
                System.out.print(stack.peek()+" ");
                if(stack.peek()>a[i]){
                    int temp=a[i];
                    a[i]=stack.pop();
                    stack.push(temp);
                    continue;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
               stack.push(a[i]);
                System.out.println("not found");
               a[i]=-1;
            }
        }
     return a;
    }
}
