package stack;

public class Provider {
     static void main(String[] args) {
        Stack<Character> s=new Stack<Character>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
class Stack<C> {
   int count=0;
   Nod head;
   Nod tail;
   public void push(int ele) {
       if(head==null){
           head=new Nod(ele);
           tail=head;
           count++;
           return;
       }
       Nod n=new Nod(ele);
       n.next=head;
       head=n;
       count++;
   }
   public int pop() {
       if(head==null){
           return -1;
       }
       Nod n=head;
       head=head.next;
       count--;
       return n.data;
   }

}
class Nod{
    int data;
    Nod next;
    public Nod(int data){
        this.data=data;
        next=null;
    }
}
