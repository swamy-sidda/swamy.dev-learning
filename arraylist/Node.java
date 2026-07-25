package arraylist;

public class Node {
    int ele;
    Node next;

    public Node(int ele) {
        this.ele = ele;
        next = null;
    }

    public Node(int ele, Node next) {
        this.ele = ele;
        this.next = next;
    }

   static void main(String[] args) {

       LinkedListExam list1 = new LinkedListExam();
        list1.add(10100);
        list1.add(201111010);


        System.out.println(list1.toList());
        System.out.println(list1 + "tolist");
    }
}

