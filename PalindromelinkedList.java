package com.company;

import java.util.Stack;

/**
 * Created by jiteshnambiar on 4/15/16.
 */
public class PalindromelinkedList {
     static class Node{
         int value ;
         Node next;

         public Node(int value){
             this.value=value;
             this.next=null;
         }
     }


    static Node head;
    public static  void insert(int val){
        if(head==null){
            head=new Node(val);
        }
        else {
         Node temp=new Node(val);
             temp.next=head;
             head=temp;
        }

    }

    public  static  void  display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.value);
            curr=curr.next;
        }
    }


    public  static  void  checkPalindrome(){
        Node slow=head;
        Node fast=head;
        Stack<Node> stack=new Stack<>();
        while(slow!=null && fast!=null && fast.next!=null){
            stack.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(  fast!=null  ){
            slow=slow.next;
        }

        while(slow!=null && !stack.isEmpty()){
            Node top=stack.pop();

            if(top.value!=slow.value){
                System.out.println("not palindrome");
                return;
            }
            slow=slow.next;
        }


        System.out.println("palindrome");

    }


    public static  void main (String[] args){

        insert(67);
        insert(67);
        insert(67);
        insert(67);
        insert(67);
        display();
        checkPalindrome();

    }
}
