package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Demo {
    public static void main(String[] args) {
      demo();
    }
    public static void demo(){
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(7);
        q.add(7);
        q.add(7);
        q.add(7);
        q.add(6);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.print(q.poll()+", ");
        }
        System.out.println();
        Deque<Integer> d=new ArrayDeque<>();
        d.add(7);
        d.add(7);
        d.add(7);
        d.add(6);
        d.add(5);
        d.add(4);
        d.add(3);
        d.add(2);
        d.add(1);
        System.out.println(d);
    }
}

