package dsa.trees.binarytree;


public class BinaryTree1 {
 Node root;
 private int count=0;


    public void preorder(){
        preorder(this.root);
    }
    private void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

 public void insert(int data){
   root= insert(root,data);
 }
 public Node insert(Node root,int data){
     if(root==null){
         Node node=new Node();
         node.data=data;
         count++;
         return node;
     }
     if(root.right==null){
         root.right=insert(root.right,data);
     }
     else if(root.left==null){
         root.left=insert(root.left,data);
     }
     else if(count%2==0){
             root.left=insert(root.left,data);
     }
     else{
         insert(root.right,data);
     }
     return root;
 }

     static void main(String[] args) {
     BinaryTree1 bt = new BinaryTree1();
     bt.insert(1);
     bt.insert(2);
     bt.insert(3);
     bt.insert(4);
     bt.insert(5);
     bt.insert(6);
     bt.insert(7);
     bt.insert(8);
     bt.insert(9);
     bt.insert(10);
     bt.insert(11);
     bt.insert(12);
     bt.preorder();

    }
}
