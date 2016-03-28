/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BstHeight
{
    class Node{
        int value;
        Node left;
        Node right;
        
        public Node (int value)
        {
          this.value=value;  
        }
    }
    
    Node root;
    
    public void insert(int v)
    {
        root=insert(root,v);
    }
    
    public Node insert(Node root,int val)
    {
        if (root == null)
        {
            root =new Node(val);
        }
        else if (val <root.value)
        {
            root.left=insert(root.left,val);
        }
        else 
        {
            root.right=insert(root.right,val);
        }
        return root;
    }
    
    public void inorder(Node root)
    {
        if (root ==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println("node values : "+root.value);
        inorder(root.right);
    }
    
    public void inorder()
    {
        inorder(root);
    }
    
    
    public void findDepth()
    {
        System.out.println("the BstHeight is ");
        System.out.println(findDepth(root));
        
    }
    
    
    public int findDepth(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        return (1 + Math.max(findDepth(root.left),findDepth(root.right)));
    }
    
    
    public void countNodes()
    {
        System.out.println("count number of nodes in BST");
        System.out.println(countNodes(root));
        System.out.println("count number of leaf nodes in BST");
        System.out.println(countLeafNodes(root));
        
    }
    
    public int countNodes(Node root)
    {
        if(root==null){
            return 0;
        }
        return(1+countNodes(root.left)+countNodes(root.right));
    }
    
    
    public int countLeafNodes(Node root)
    {
        if(root== null)
        {
            return 0;
        }
        if (root.left==null && root.right == null)
        {
            return 1;
        }
        return(countLeafNodes(root.left)+countLeafNodes(root.right));
        
    }
    
    public void sumOfAllNodes()
    {
        System.out.println("sum of all nodes in a BST");
        System.out.println(sumOfAllNodes(root));
        System.out.println("SUM of all leaf nodes in a BST");
        System.out.println(sumOfAllLeafNodes(root));
        
    }
    
    public int sumOfAllNodes(Node root){
        if(root ==null){
            return 0;
            
        }
            return(root.value+sumOfAllNodes(root.left)+sumOfAllNodes(root.right));
    }
    
     public int sumOfAllLeafNodes(Node root){
        if(root ==null){
            return 0;
        }
        if(root.left==null && root.right==null){
          return root.value;  
        }
        
        return(sumOfAllLeafNodes(root.left)+sumOfAllLeafNodes(root.right));
    }
    
    public void printLeafNodes()
    {
        System.out.println("the leaf noes of the BST are ");
        printLeafNodes(root);
        
    }
    
    public void printLeafNodes(Node root){
        if (root ==null)
        {
            return;
        }
            
            if(root.left==null && root.right == null)
            {
                System.out.println(root.value);
            }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }
    
    public void printNonLeafNodes()
    {
        System.out.println("printing Non Leaf Nodes ");
        printNonLeafNodes(root);
    }
    
    public void printNonLeafNodes(Node root){
        if(root==null)
        {
            return ;
        }
        if(root.left!=null||root.right!=null){
            System.out.println(root.value);
        }
        printNonLeafNodes(root.left);
        printNonLeafNodes(root.right);
    }
    
    public void reverseInorder()
    {
        reverseInorder(root);
    }
    
    public void reverseInorder(Node root){
        if (root==null){
            return ;
        }
            reverseInorder(root.right);
            System.out.println(root.value);
            reverseInorder(root.left);
    }
    
    public void printallNonSiblingNodes()
    {
        System.out.println("THE  nodes with no  sibling are");
        printallNonSiblingNodes(root);
    }
    
    public void printallNonSiblingNodes(Node root )
    {
        if (root == null){
            return;
        }
        if(root.left!=null && root.right==null)
        {
            System.out.println(root.left.value);
        }
        if(root.left==null && root.right!=null)
        {
            System.out.println(root.right.value);
        }
        
        printallNonSiblingNodes(root.left);
        printallNonSiblingNodes(root.right);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BstHeight bst=new BstHeight();
		bst.insert( 1);
		bst.insert(7);
		bst.insert(6);
		bst.insert(4);
		bst.insert(9);
		System.out.println("The inorder traversal of the BST ");
		bst.inorder();
		bst.findDepth();
		bst.countNodes();
		bst.sumOfAllNodes();
		bst.printLeafNodes();
		bst.printNonLeafNodes();
		
		System.out.println("Reverse inorder traversal of the tree");
		bst.reverseInorder();
		bst.printallNonSiblingNodes();
		
		
	}
}
