package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
     static void main(String[] args) {
        StackingQueue s = new StackingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        System.out.println(s);
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
        System.out.println(s.poll());
    }
}

class StackingQueue {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q1 = new LinkedList<>();

    public void push(int x) {
        q.add(x);
    }

    public int poll() {
        int element=0;
        if (!q1.isEmpty()) {
            element=q1.poll();
            return element;
        } else if (q1.size() == 0 && !q.isEmpty()) {
            for (int i = q.size()-1; i >= 0; i--) {
                q1.add(q.poll());
            }
            element=q1.poll();
            return element;
        } else if (q.isEmpty() && q1.isEmpty()) {
            element=-1;
        }
        return element;
    }

    public String toString() {
        return q.toString();
    }
}

