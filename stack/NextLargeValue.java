package stack;

import java.util.Stack;

 public class NextLargeValue {
     static void main(String[] args) {
       Integer[] arr={4,2,6,0,1,8,9,10,1,11,9,8,7,6,5};
       iterateValue(arr);
    }
    public static void iterateValue(Integer[] arr){
        Stack<Integer> stack=new Stack<>();
        for (Integer integer : arr) {
            if (stack.isEmpty()) {
                stack.push(integer);
            } else {
                while (!stack.isEmpty() && stack.peek() < integer) {
                    System.out.println(stack.peek() + " " + integer);
                    stack.pop();
                }
                stack.push(integer);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek()+" "+null);
            stack.pop();
        }

    }
}
