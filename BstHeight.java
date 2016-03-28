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
        System.out.println("value "+root.value);
        inorder(root.right);
    }
    
    public void inorder()
    {
        inorder(root);
    }
    
    
    public void findDepth()
    {
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
	public static void main (String[] args) throws java.lang.Exception
	{
		BstHeight bst=new BstHeight();
		bst.insert( 1);
		bst.insert(7);
		bst.insert(6);
		bst.insert(4);
		bst.insert(9);
		bst.inorder();
		bst.findDepth();
	}
}
