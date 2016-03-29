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
    public void levelOrderTraversal()
    {
        System.out.println("Level order traversal for the bst is ");
        levelOrderTraversal(root);
    }
    
    
    public void levelOrderTraversal(Node root){
        Queue<Node> q=new LinkedList<Node>();
        if(root==null){
            return;
        }
        q.add(root);
        
        while (!q.isEmpty())
        {
            Node current=q.poll();
            System.out.print(current.value+":");
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
    }
    public void reverseLevelOrderTraversal()
    {
        System.out.println();
        System.out.println("reverse level order traversal");
        
        reverseLevelOrderTraversal(root);
    }
    
    public void reverseLevelOrderTraversal(Node root)
    {
        
        if(root==null){
            return;
        }
        
        Queue<Node> q=new LinkedList<Node>();
        Stack<Node> s=new Stack<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node current=q.poll();
            s.push(current);
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop().value +":");
        }
        
    }
    public void horizontalsum()
    {
        System.out.println();
        System.out.println("horizonatal sum ");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        horizontalsum(root,0,map);
        System.out.println(map.size());
       /* Set keyset=map.keySet();
        for(int i=0;i<keyset.size();i++)
        System.out.println("level :"+map.get(i)+"value");*/
        
        
        for (int key : map.keySet()) {
        System.out.println("level: " + key + " sum: " + map.get(key));
    }

    }
    
    
    public void horizontalsum(Node root,int level,HashMap<Integer,Integer> map){
        if(root==null){
            return ;
        }
        if(map.get(level)==null)
        {
            map.put(level,root.value);
        }
        else 
        {
            int sum=map.get(level)+root.value;
            map.put(level,sum);
        }
        horizontalsum(root.left,level+1,map);
        horizontalsum(root.right,level+1,map);
    }
    
    public void verticalSum(){
        System.out.println("vertical sum of nodes ");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        verticalSum(root,0,map);
        
        for (int key : map.keySet()) {
        System.out.println("horizontal distance from rooot : " + key + " sum: " + map.get(key));
        
    }
    }
    
    public void verticalSum (Node root,int level, HashMap<Integer,Integer> map)
    {
        if(root ==null){
            return;
        }
        if(map.get(level)==null)
        {
            map.put(level,root.value);
        }
        else {
            int sum =map.get(level)+root.value;
            map.put(level,sum);
        }
        
      verticalSum(root.left,level-1,map);
      verticalSum(root.right,level+1,map);
    }
    
    
    public void topView()
    {
        System.out.println("the top view of the bst ");
        HashSet<Integer> set=new HashSet<Integer>();
        topview(root,0,set);
    }
    
    public void topview(Node root,int hd,HashSet<Integer> set){
        if(root==null){
            return;
        }
        if(set.add(hd))
        {
            System.out.println(root.value);
            
        }
        topview(root.left,hd-1,set);
        topview(root.right,hd+1,set);
    }
    
    public void bottomView(){
        System.out.println("bottom view of the tree");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        bottomView(root,0,map);
        
        for (int key : map.keySet()) {
        System.out.println("bottomView from rooot : "+ map.get(key));
        
    }
    }
    
    public void bottomView(Node root,int hd,HashMap<Integer,Integer> map){
        if(root==null){
            return ;
        }
        map.put(hd,root.value);
        
        bottomView(root.left,hd+1,map);
        bottomView(root.right,hd-1,map);
    }
    
    
    public void findMinInTree()
    {
        System.out.println("the minimum node in the tree is ");
        System.out.println(findMinInTree(root));
    }
    
    public int findMinInTree(Node root){
        if(root==null){
            return Integer.MIN_VALUE; 
        }
        Node current=root;
        while(current.left!=null){
            current=current.left;
        }
        return current.value;
    }
    
    public void findMaxInTree()
    {
        System.out.println("the maximum node in the tree is ");
        System.out.println(findMaxInTree(root));
    }
    
    public int findMaxInTree(Node root){
        if(root==null){
            return Integer.MAX_VALUE; 
        }
        Node current=root;
        while(current.right!=null){
            current=current.right;
        }
        return current.value;
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
		bst.levelOrderTraversal();
		bst.reverseLevelOrderTraversal();
		bst.horizontalsum();
		bst.verticalSum();
		bst.topView();
		bst.bottomView();
		bst.findMinInTree();
		bst.findMaxInTree();
	}
}
