package dsa.trees.binarysearchtree;

public class BinarySearchTree {
    Node root;
    public void insertElement(int data){
       if(root==null){
           root=new Node(data);
           return;
       }
       root=insertElement(root,data);
    }
    private Node insertElement(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertElement(root.left,data);
        }
        else if(data>root.data){
            root.right=insertElement(root.right,data);
        }
        return root;
    }
    public boolean search(int data){
       return search(root,data);
    }
    private boolean search(Node root,int data){
        if(root==null){
           return  false;
        }
        if(data==root.data){
            return true;
        }
        else if(data<root.data){
            return search(root.left,data);
        }
        else if(data>root.data){
            return search(root.right,data);
        }
        return false;
    }
    public void  inorder(){
        inorder(root);
    }
    private void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
