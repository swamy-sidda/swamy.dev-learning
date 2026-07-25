package dsa.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUsingQueue {
    Node root;

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void insert(int key) {
        Node node = new Node();
        node.data = key;
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.left == null) {
                n.left = node;
                return;
            } else {
                queue.add(n.left);
            }
            if (n.right == null) {
                n.right = node;
                return;
            } else {
                queue.add(n.right);
            }
        }
    }

    int count = 0;
     static void main(String[] args) {
        TreeUsingQueue tree = new TreeUsingQueue();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.preorder();


    }
}

