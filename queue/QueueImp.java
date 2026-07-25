package queue;

import java.util.ArrayDeque;
import java.util.Queue;

class QueueImp1 {
    int count=0;
    Node front;
    Node rear;
    public void push(int d) {
        Node node = new Node(d);
        if(count==0){
            front=rear=node;
            count++;
        }
        rear.next = node;
        rear = node;
        count++;
    }
    public String toString(){
        StringBuilder b=new StringBuilder();
        b.append("[");
        Node temp=front;
        while(temp.next!=null&&temp.next!=rear){
            b.append(temp.ele);
            b.append(", ");
            temp=temp.next;
        }
        b.append(temp.ele);
        b.append("]");
        return  b.toString() ;
    }
    public int pop() {
        if(count==0){
            return -1;
        }
        Node temp = front;
        front = front.next;
        count--;
        return (int)temp.ele;
    }
    public int peek() {
        if(count==0){
            return -1;
        }
        return (int)front.ele;
    }
    public boolean isEmpty() {
        return count==0;
    }
    public int size()
    {
        return count;
    }
}
public class QueueImp {
    static void main(String[] args) {
        Queue<Integer> q1=new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        System.out.println(q1);
        System.out.println(q1.size());
        QueueImp1 q = new QueueImp1();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);
        System.out.println(q);
        System.out.println( q.pop()+""+ q.pop()+""+ q.pop()+""+ q.pop());
    }
}
