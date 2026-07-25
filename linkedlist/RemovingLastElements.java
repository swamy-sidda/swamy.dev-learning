package linkedlist;

public class RemovingLastElements {
    class Node{
        int data;
        Node next;
        Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node last;
    Node head=null;
    public void add(int a){
        Node node=new Node(a);
       if(head==null){
           head=node;
           last=head;
       } else  {
           last.next=node;
           last=node;
       }
    }
    public boolean remove(int index){
        if(head==null) return false;
        int count=0;
        Node current=head;
        while(current!=null){
            current=current.next;
            count++;
        }
        if(count==index){
            head=head.next;
            return true;
        }
        int i=1;
        if(index>count) return false;
        current=head;
        while(i<count-index-1){
           current=current.next;
           i++;
        }
        current.next=current.next.next;
        return true;
    }
    public String toString(){
        Node current=head;
        String str="[ "+current.data;
        while(current.next!=null){
            current=current.next;
            str+=", "+current.data;
        }
        return str+" ]";
    }
    static void main() {
        RemovingLastElements obj = new RemovingLastElements();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);
        obj.add(10);
        obj.add(11);
        System.out.println(obj.toString());
        System.out.println(obj.remove(10));
        System.out.println(obj.toString());
    }

}
