package stack;
import java.util.Stack;
public class DeletingLargeElementfromStack {
    static int i = 0;

    static void main() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(111);
        stack.push(2);
        stack.push(3);
        stack.push(41);
        stack.push(5);
        stack.push(61);
        stack.push(7);
        largeElementInStack(stack);
        System.out.println(stack);
    }

    public static void largeElementInStack(Stack<Integer> stack) {
        largeElementInStack(stack, 0);
    }

    private static void largeElementInStack(Stack<Integer> stack, int num) {
        if (stack.isEmpty()) {
            return;
        }
        if (!stack.isEmpty() && stack.peek() > num) {
            int temp = stack.pop();
            i = temp;
            largeElementInStack(stack, temp);
            if (temp != i) {
                stack.push(temp);
            }
        }
        else
        {
            int temp = stack.pop();
            largeElementInStack(stack, num);
            stack.push(temp);
        }
    }
}
