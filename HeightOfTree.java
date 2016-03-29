package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jiteshnambiar on 3/29/16.
 */



public class HeightOfTree {

    class Node {
        int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;
        }
    }
      Node root;

    public   Node insert(Node root ,int value){
        if(root==null){
            root=new Node(value);
        }

        if(value<root.value){
            root.left=insert(root.left,value);
        }
        else if(value>root.value){
            root.right=insert(root.right,value);
        }

        return root ;
    }

    public void insert(int  value){
      root=  insert(root,value);
    }

    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void heightOfTreeRecursive(){
        System.out.println("the height of the tree is ");
        System.out.println(heightOfTreeRecursive(root));
    }

    public int heightOfTreeRecursive(Node root){
        if(root==null){
            return 0;
        }

        return(1+Math.max(heightOfTreeRecursive(root.left),heightOfTreeRecursive(root.right)));
    }

    public void heightOfTreeIterative(){
        System.out.println("height of tree iterative ");
        System.out.println(heightOfTreeIterative(root));
    }

    public  int heightOfTreeIterative(Node root){
        Queue<Node> q=new LinkedList<>() ;
        int height=0;
        q.add(root);
        int nodeCount=0;
        while(1==1){
           nodeCount=q.size();
            if(nodeCount==0){
                return height;
            }

                height++;


            while(nodeCount>0){
                Node current=q.poll();
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                nodeCount--;
            }

        }
 }

    public static void main (String[] args){
        HeightOfTree heightOfTree=new HeightOfTree();
        heightOfTree.insert(56);
        heightOfTree.insert(34);
        heightOfTree.insert(23);
        heightOfTree.insert(78);
        heightOfTree.insert(67);
        heightOfTree.insert(90);
        heightOfTree.inOrder();
        heightOfTree.heightOfTreeRecursive();
        heightOfTree.heightOfTreeIterative();
    }
}
