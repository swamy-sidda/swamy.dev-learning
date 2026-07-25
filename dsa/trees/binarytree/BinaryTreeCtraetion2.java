package dsa.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCtraetion2 {
    Node root;
    int count = 0;
   public BinaryTreeCtraetion2(){}


    public void add(int data){
        count++;
        root=add(root,data,count);
    }
    private Node add(Node root, int data,int index){
      if(root==null){
          Node node= new Node();
          node.data=data;
          return node;
      }
      if(index%2==0){
          root.left=add(root.left,data,index/2);
      }
      else{
          root.right=add(root.right,data,index/2);
      }
      return root;
    }

    public void levelorder(){
       levelorder(root);
       System.out.println();
    }
    private void levelorder(Node root){
       if(root==null) return;
       Queue<Node> queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           Node temp=queue.poll();
           System.out.print(temp.data+" ");
           if(temp.left!=null) queue.add(temp.left);
           if(temp.right!=null) queue.add(temp.right);
       }

    }

    public void preorder(){
        preorder(root);
        System.out.println();
    }
    private void preorder(Node root){
       if(root==null) return;
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
    }

    static void main(String[] args) {
        BinaryTreeCtraetion2 obj = new BinaryTreeCtraetion2();
        obj.add(1);obj.add(2);obj.add(3);obj.add(4);obj.add(5);obj.add(6);obj.add(7);obj.add(8);
        obj.add(9);obj.add(10);obj.add(11);obj.add(12);obj.add(13);obj.add(14);obj.add(15);obj.add(16);
        obj.add(17);obj.add(18);obj.add(19);obj.add(20);
        obj.levelorder();
        obj.preorder();
    }
}
