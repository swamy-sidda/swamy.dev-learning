package linkedlist;

public class SwapingPairs {
    static void main() {
       MyLinkedList list = new MyLinkedList();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       list.add(7);
       list.add(8);
       list.add(9);
       list.add(10);
       System.out.println(list);
        Nod head = swapPairs(list.head);

        Nod curr = head;
        while (curr != null) {
            System.out.print(curr.ele + " ");
            curr = curr.next;
        }
    }
    public static Nod swapPairs(Nod head) {
       if(head==null||head.next==null)
           return head;
       Nod newHead = head.next;
       Nod prev=null;
       Nod curr=head;
       while(curr!=null && curr.next!=null) {
           Nod sec=curr.next;
           Nod np=sec.next;

           sec.next=curr;
           curr.next=np;
           if(prev!=null)
               prev.next = sec;
           prev=curr;
           curr=np;
       }
       return newHead;
    }

}
