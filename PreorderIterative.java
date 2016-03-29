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

    public static void main (String[] args){
        root=insert(root,8);
        root=insert(root,1);
        root=insert(root,10);
        root=insert(root,4);
        System.out.println("Recursive preorder traversal of the tree");
        preOrder(root);
        System.out.println("iterative preorder traversal of the tree");
        preOrderIterative(root);



    }
}
