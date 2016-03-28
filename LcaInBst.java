/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

 class Node
 {
     int value;
     Node left;
     Node right;
     
     public Node(int value)
     {
         this.value=value;
     }
 }
 
 
class LcaInBst
{
  static Node root;
  
  public static int findlca(int a ,int b)
  {
      if(a>b)
      {
          int temp=b;
          b=a;
          a=b;
      }
      
      System.out.println(root.value);
      Node node1=findNodePresent(a,root);
      //System.out.println(node1.value);
          if(node1!=null)
          {
              Node node2=findNodePresent(b,root);
         
              if (node2!=null){
               Node result =findLcaNodes(node1,node2,root);
               System.out.println(result);
               if (result!=null)
               {
                   return result.value;
               }
              }
          }
          
          return -1;
   
  }
  
  
  
  public static Node findLcaNodes(Node n1,Node n2 ,Node root)
  {
      if (root==null)
      {
          return null;
      }
      
      if (n1==root||n2==root)
      return root;
      
      if(n1.value<root.value && root.value>n2.value)
      {
          return root;
      }
      
      if(n2.value>root.value){
         return findLcaNodes(n1,n2,root.right);
          
      }
         else 
         {
         return findLcaNodes(n1,n2,root.left);
         }
         
      
    }
      
  
  
   public static Node findNodePresent(int key,Node root)
   {
     if (root==null) 
     {
     return null;
     }
     
     if (root.value==key)
     {
         System.out.println(root.value);
         return root;
     }
     
     else  if (key<root.value)
     {
         System.out.println(root.value);
        root=findNodePresent(key,root.left);
     }
     else  if(key>root.value)
     {
         System.out.println("rt side ");
         System.out.println(root.value);
     root= findNodePresent(key,root.right);
     }
     return root;
   }
 
 

	public static void main (String[] args) throws java.lang.Exception
	{
		LcaInBst lca=new LcaInBst();
		root=new Node(5);
		root.left=new Node(2);
		root.right=new Node(6);
		root.left.left=new Node(0);
		root.left.right=new Node(3);
		root.left.left.right=new Node(1);
		root.right.right=new Node(9);
		root.right.right.left=new Node(7);
		root.right.right.left.right=new Node(8);
		
		System.out.println(lca.findlca(9,8));
		
	}
}
