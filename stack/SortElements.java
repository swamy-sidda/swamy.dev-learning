package stack;


import java.util.Stack;

public class SortElements {
    static void main() {
        java.util.Stack<Integer> st = new java.util.Stack<Integer>();
        st.push(1);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(5);
        st.push(6);
        st.push(4);
        st.push(3);
        st.push(2);
        System.out.println(st);
        sort(st);
        System.out.println("Sorted elements:"+st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }
    public static void sort(java.util.Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sort(stack);
        insertElement(stack, top);
    }
    public static void insertElement(java.util.Stack<Integer> stack, int element) {
        if (stack.isEmpty()||element<stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertElement(stack,element);
        stack.push(top);
    }
}
