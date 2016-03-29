package com.company;

import java.util.Stack;

/**
 * Created by jiteshnambiar on 3/29/16.
 */


 class Node
{
    int value;
    Node right;
    Node left;

    Node(int value){
        this.value=value;
    }


}
public class PreorderIterative {

    static  Node root;

    public static  Node insert(Node root ,int value){
        if(root==null){
            root=new Node(value);
        }

        if(value<root.value){
           root.left=insert(root.left,value);
        }
        else if(value>root.value){
            root.right=insert(root.right,value);
        }

    return root ;}


    public static void preOrder(Node root){
        if(root ==null){
            return;
        }
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static  void preOrderIterative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> s=new Stack<Node>();
        s.push(root);
        while (!s.isEmpty()) {
            Node current=s.pop();
            System.out.println(current.value);
            if (current.right != null) {
                s.push(current.right);
            }
            if (current.left != null) {
                s.push(current.left);
            }
        }
    }
    public static  void inOrderIterative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> s=new Stack<Node>();
        Node current=root;
        while(!s.isEmpty()|| current!=null){
            while(current!=null){
                s.push(current);
                current=current.left;
            }
            Node n=s.pop();
            System.out.println(n.value);
            current=n.right;
        }

    }


    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }


    public  static  void postOrderIterative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()){
            Node current= s1.pop();
            s2.push(current);
            if(current.left!=null){
                s1.push(current.left);
            }
            if(current.right!=null){
                s1.push(current.right);
            }
        }
        while(!s2.isEmpty()){
            System.out.println(s2.pop().value);
        }
    }
    public static void main (String[] args){
        root=insert(root,8);
        root=insert(root,1);
        root=insert(root,10);
        root=insert(root,4);
        root=insert(root,9);
        root=insert(root,2);
        root=insert(root,40);
        root=insert(root,30);
        root=insert(root,34);
        root=insert(root,23);
        root=insert(root,25);
        root=insert(root,87);
        System.out.println("Recursive preorder traversal of the tree");
        preOrder(root);
        System.out.println("iterative preorder traversal of the tree");
        preOrderIterative(root);
        System.out.println("iterative INORDER traversal of the tree");
        inOrderIterative(root);
        System.out.println("Recursive inorder traversal of the tree");
        inOrder(root);
        System.out.println("Recursive postorder traversal of the tree");
        postOrder(root);
        System.out.println("iterative postorder traversal of the tree");
        postOrderIterative(root);


    }
}
