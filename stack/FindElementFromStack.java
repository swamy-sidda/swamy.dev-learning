package stack;

import java.util.Stack;

public class FindElementFromStack {
    static void main() {
       Stack<Integer> stack = new Stack<>();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
       stack.push(60);
       stack.push(70);
       stack.push(80);
       stack.push(90);
       thereOrNot(stack,100);
        System.out.println(stack);
    }
    public static void thereOrNot(Stack<Integer> stack, int target) {
        if(stack.isEmpty()) {
            System.out.println("The Element Not Available ");
            return;
        }
        if(target==stack.peek()){
            System.out.println("The Element Available ");
            return;
        }
        int top=stack.pop();
        thereOrNot(stack,target);
        stack.push(top);
    }
}
