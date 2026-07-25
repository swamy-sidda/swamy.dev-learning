package dsa.trees.generictree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Dynamic {
    Node root;
    Scanner sc = new Scanner(System.in);

    public void insert() {
        System.out.print("Enter node data: and child values ");
        this.root = insert(sc.nextInt(), sc.nextInt());
    }

    private Node insert(int n, int c) {
        Node node = new Node();
        node.data = n;
        for (int i = 0; i < c; i++) {
            Node child = insert(sc.nextInt(), sc.nextInt());
            node.children.add(child);
            if (i == c - 1) {
                System.out.println("one child completed");
            }
        }
        return node;
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void preOrderTraversal(Node node) {
        System.out.print(node.data + " ");
        for (Node temp : node.children) {
            preOrderTraversal(temp);
        }
    }

    public void zigzagTraversal() {
        zigzagTraversal(root);
    }

    private void zigzagTraversal(Node root) {
        if (root == null) return;
        Stack<Node> current = new Stack<>();
        Stack<Node> next = new Stack<>() ;
        boolean flag = true;
        current.add(root);
        while (!current.isEmpty()) {
            Node node = current.pop();
            System.out.print(node.data + " ");
            if (!flag) {
                for (Node temp : node.children)
                    next.add(temp);
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--)
                    next.add(node.children.get(i));
            }
            if (current.isEmpty()) {
                flag = !flag;
                Stack<Node> temp = current;
                current = next;
                next = temp;

            }
        }
    }


             static void main (String[]args){
                Dynamic d = new Dynamic();
                d.insert();
                d.preOrder();
                System.out.println();
                d.zigzagTraversal();
            }
        }
