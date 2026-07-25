package stack;

public class MyStack {
    private Node head;
    private int count=0;
    public void push(Object val) {
        if (head == null) {
            head = new Node(val, null);
            count++;
            return;
        }
        Node node = new Node(val, head);
        head = node;
        count++;
    }
    public Object pop() {
        if(head==null) return null;
        Node node = head;
        head = head.next;
        count--;
        return node.val;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public Object peek() {
        if(head==null) return null;
        return head.val;
    }
    public int size() {
        return count;
    }
}
