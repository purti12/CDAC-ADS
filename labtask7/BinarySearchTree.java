/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask7;

/**
 *
 * @author hp
 */

  
class Node{
    Node left;
    int data;
    Node right;

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }    
}
 public class BinarySearchTree {  
     Node root;
    public Node insertNode(Node root,int value){
        if(root==null)
            return new Node(value);
        else if(root.data<value)
            root.right=insertNode(root.right, value);
        else
            root.left=insertNode(root.left, value);
        return root;
    }
     
    public Node deleteNode(Node root,int value){
        if(root==null)
            return null;
        else if(root.data<value)
            root.right=deleteNode(root.right,value);
        else if(root.data>value)
            root.left=deleteNode(root.left,value);
        else{
            if(root.left==null && root.right==null)
                return null;
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                int rightMin=getRightMin(root.right);
                root.data=rightMin;
                root.right=deleteNode(root.right, rightMin);
            } 
        }
        return root;
    }

    public int getRightMin(Node right) {
        Node temp=right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
    
    public void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    
    
    public boolean Search(Node root, int value){
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        if(root.data<value)
            Search(root.right, value);
        else
            Search(root.left, value);
        return false;
    }
    
   
    
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root=bst.insertNode(bst.root, 100);
        bst.root=bst.insertNode(bst.root, 50);
        bst.root=bst.insertNode(bst.root, 10);
        bst.root=bst.insertNode(bst.root, 60);
        bst.root=bst.insertNode(bst.root, 200);
        bst.root=bst.insertNode(bst.root, 250);
        bst.root=bst.insertNode(bst.root, 150);
        bst.root=bst.insertNode(bst.root, 300);
        
        
        System.out.println("Inorder Traversal: ");
        bst.inOrder(bst.root);
        
        bst.deleteNode(bst.root,100);
        System.out.println("After Deleting: ");
        bst.inOrder(bst.root);
        
    }
}


