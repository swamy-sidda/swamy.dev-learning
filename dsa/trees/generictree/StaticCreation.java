package dsa.trees.generictree;


import java.util.*;

public class StaticCreation {
    private Node root;
    private List<Integer> list;
    private int count = 0;


    public void getElements(List<Integer> list) {
        this.list = list;
    }

    public void insert() {
        Stack<Node> stack = new Stack<Node>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == -1) {
                stack.pop();
            } else {
                Node temp = new Node();
                temp.data = list.get(i);
                if (!stack.isEmpty()) {
                    stack.peek().children.add(temp);
                    count++;
                } else {
                    root = temp;
                }
                stack.push(temp);
            }
        }

    }

    public void postOrderTraversal(Node root) {
        for (Node temp : root.children) {
            postOrderTraversal(temp);
        }
        System.out.print(root.data + " ");
    }

    public void preOrderTraversal(Node root) {
        System.out.print(root.data + " ");
        for (Node temp : root.children) {
            preOrderTraversal(temp);
        }
    }

    public void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            for (Node child : temp.children) {
                queue.add(child);
            }
        }
    }

    public int getSize() {
        return getSize(root);
    }

    private int getSize(Node root) {
        int count = 0;
        for (Node temp : root.children) {
            count += getSize(temp);
        }
        return count + 1;
    }

    public boolean remove(int key) {
        if (root == null) return false;
        if (root.data == key) {
            root = null;
            return true;
        }
        return remove(root, key);
    }

    private boolean remove(Node root, int key) {
        for (int i = 0; i < root.children.size(); i++) {
            Node child = root.children.get(i);
            if (child.data == key) {
                child.children.remove(i);
                return true;
            }
            if (remove(child, key)) {
                return true;
            }
        }
        return false;
    }

    private boolean delete(int key) {
        return delete(root, key);
    }

    private boolean delete(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) {
            root = null;
            return true;
        }
        for (int i = 0; i < root.children.size(); i++) {
            Node child = root.children.get(i);
            if (child.data == key) {
                root.children.remove(i);
                return true;
            }
        }
        return false;
    }


    public void removeDuplicates(int key) {
        if (root == null) return;
        removeDuplicates(root, key);
        while (root != null && root.data == key) {
            if (root.children.isEmpty()) {
                root = null;
            } else {
                Node node = root.children.get(0);
                for (int i = 1; i < root.children.size(); i++) {
                    node.children.add(root.children.get(i));
                }
                root = node;
            }
            removeDuplicates(root, key);
        }
    }

    private void removeDuplicates(Node root, int key) {
        if (root == null) return;
        for (int i = 0; i < root.children.size(); i++) {
            Node child = root.children.get(i);
            if (child.data == key) {
                root.children.remove(i);
                for (int j = 0; j < child.children.size(); j++) {
                    root.children.add(i + j, child.children.get(j));
                }
                i--;
            } else {
                removeDuplicates(child, key);
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 10, 10, -1, 20, 10, -1, 20, -1, 30, -1, -1, 30, -1, -1, 20, 10, -1, 20
                , 10, -1, 20, -1, 30, -1, -1, 30, -1, -1, 30, 10, -1, 20, 10, -1, 20, -1, 30, -1, -1, 30, -1, -1, -1);
        StaticCreation s = new StaticCreation();
        s.getElements(list);
        s.insert();
        s.levelOrderTraversal(s.root);
        System.out.println();
        System.out.println(s.getSize());
        System.out.println("----------------------------------------");
        s.removeDuplicates(10);
        System.out.println(s.getSize());
        s.levelOrderTraversal(s.root);
        System.out.println();
        s.levelorder(s.root);


//        list=Arrays.asList(20,20,-1,30,20,-1,40,20,-1,30,-1,40,-1,-1,30,-1,-1,40,-1,50,-1,-1);
//        s2.getElements(list);
//        s2.insert();

//        list=Arrays.asList(10,20,50,-1,60,-1,70,-1,-1,30,80,-1,90,-1,-1,40,100,110,-1,120,-1,130,-1,-1,-1,-1);
//        s2.getElements(list);
//        s2.insert();
//       }
    }

    public void levelorder(){
        levelorder(root);
    }
    private void levelorder(Node root){
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Queue<Node> queue2 = new LinkedList<>();
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (queue.isEmpty()) {
                System.out.print("->-<-");
            }
            if (!temp.children.isEmpty()) {
                queue2.addAll(temp.children);
            }
            if (queue.isEmpty()) {
                Queue<Node> queue3 = queue2;
                queue2=queue;
                queue=queue3;
            }
        }
    }

}
