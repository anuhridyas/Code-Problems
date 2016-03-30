package com.company;

import java.util.Stack;

/**
 * Created by jiteshnambiar on 3/29/16.
 */


public class CommonNodes {

    class Node
    {
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value=value;
        }
    }




    public  Node insert(Node root ,int value){
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



    public  void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void findCommonNodes(Node root1, Node root2){
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();
        while(1==1){
            while (root1!=null){
                s1.push(root1);
                root1=root1.left;
            }
            while(root2!=null){
                s2.push(root2);
                root2=root2.left;
            }
            if(!s1.isEmpty() && !s2.isEmpty()){
                Node current1=s1.peek();
                Node current2=s2.peek();
                if(current2.value==current1.value){
                    s1.pop();
                    s2.pop();
                    System.out.println("Common nodes "+current1.value);
                    root1=current1.right;
                    root2=current2.right;
                }
                else if(current1.value<current2.value){
                    s1.pop();
                    root1=current1.right;
                    root2=null;
                }
                else if(current1.value>current2.value){
                    s2.pop();
                    root1=null;
                    root2=current1.right;
                }


            }

            else break;
        }

    }

    public static void main (String[] args)
    {
     CommonNodes commonNodes=new CommonNodes();
     Node root1=null;
        root1= commonNodes.insert(root1,1);
        root1= commonNodes.insert(root1,2);
        root1=commonNodes.insert(root1,5);
        root1=commonNodes.insert(root1,4);
        System.out.println("inorder traveral of the first tree");
        commonNodes.inOrder(root1);
        Node root2=null;
        root2=commonNodes.insert(root2,7);
        root2=commonNodes.insert(root2,9);
        root2=commonNodes.insert(root2,2);
        root2=commonNodes.insert(root2,1);
        System.out.println("inorder traveral of the second tree");
        commonNodes.inOrder(root2);
        commonNodes.findCommonNodes(root1,root2);
    }

}
