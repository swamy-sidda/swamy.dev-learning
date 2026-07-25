package stack;

import java.util.Stack;

public class LargeElementInStack {
    static void main() {
       Stack<Integer> stack = new Stack<>();
       stack.push(1);
       stack.push(12);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(61);
       stack.push(7);
       stack.push(8);
       largeElementInStack(stack);
        System.out.println(stack);

    }
    public static void largeElementInStack(Stack<Integer> stack) {
        largeElementInStack(stack,0);
    }
    private static void largeElementInStack(Stack<Integer> stack,int num) {
        if(stack.isEmpty()) {
            System.out.println("large number is "+num);
            return;
        }
        if(!stack.isEmpty()) {
            int temp = stack.pop();
            if(temp>num) {
                largeElementInStack(stack,temp);
            }
            stack.push(temp);
        }
        if(!stack.isEmpty()&& stack.peek()<num) {
            int temp = stack.pop();
            largeElementInStack(stack,num);
            stack.push(temp);
        }
    }
}
