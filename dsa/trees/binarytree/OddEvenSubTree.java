package dsa.trees.binarytree;

public class OddEvenSubTree {
    Node root;
    private int oddcount=0;
    private int evencount=0;



    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        inorder(node.left);
        inorder(node.right);
    }


    //adding elements into tree
    public void add(int data){
        if(root==null){
            Node node =new Node();
            node.data=data;
            root=node;
            return;
        }
        if(data%2==1){
            root.left= oddAdd(root.left,data);
        }
        else{
            root.right= evenAdd(root.right,data);
        }
    }
    private Node oddAdd(Node root, int data){
        if(root==null){
            Node node =new Node();
            node.data=data;
            oddcount++;
            return node;
        }
        if(root.left==null)
            root.left= oddAdd(root.left,data);
        else if(root.right==null)
            root.right= oddAdd(root.right,data);
        else if(oddcount%2==0)
             oddAdd(root.left, data);
        else if(oddcount%2==1)
              oddAdd(root.right, data);
       return root;
    }
    private Node evenAdd(Node root, int data){
        if(root==null){
            Node node =new Node();
            node.data=data;
            evencount++;
            return node;}
        if(root.left==null)
            root.left= evenAdd(root.left,data);
        else if(root.right==null)
            root.right= evenAdd(root.right,data);
        else if(evencount%2==0)
            evenAdd(root.left, data);
        else if(evencount%2==1)
            evenAdd(root.right, data);
        return root;
    }




     static void main(String[] args){
        OddEvenSubTree od=new OddEvenSubTree();
        od.add(1);
        od.add(2);
        od.add(3);
        od.add(4);
        od.add(5);
        od.add(6);
        od.add(7);
        od.add(8);
        od.add(9);
        od.add(10);
        od.add(11);
        od.add(12);
        od.add(13);
        od.add(14);
        od.inorder();

    }
}
