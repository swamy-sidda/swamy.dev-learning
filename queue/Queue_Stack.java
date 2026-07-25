package queue;

import java.util.Stack;

 class Queue_Stack1 {
    Stack<Integer> stk1=new Stack<>();
    Stack<Integer> stk2=new Stack<>();

    public void  push(int x){
        stk1.push(x);
        System.out.println(x+" is added");
    }
    public void  pop() {
        if (stk2.isEmpty() && !stk1.isEmpty()) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
            int m=stk2.pop();
            System.out.println(m+" is removed from queue");
        }
        else if (!stk2.isEmpty()) {
            int m=stk2.pop();
            System.out.println(m+" is removed from queue");
        }
        else {
            if(stk1.isEmpty()&&stk2.isEmpty()){
               System.out.println("no element found in queue");
            }
        }
    }
}
public class Queue_Stack {
      static void main(String sd[])
     {
        Queue_Stack1 q=new Queue_Stack1();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.pop();
        q.pop();
         q.push(1);
         q.push(2);
         q.push(3);
        q.pop();
        q.pop();
        q.pop();
         q.pop();
         q.pop();
         q.pop();


     }
}
