package com.company;

/**
 * Created by jiteshnambiar on 3/30/16.
 */
public class ReverseLinkedList {

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }

    }
     Node  head;

    public void insert(int value){
        if(head==null){
            head=new Node(value);
        }
        else {
            Node temp=new Node(value);
            temp.next=head;
            head=temp;
        }

    }

    public void display(){
        Node current=head;
        while(current!=null){
                System.out.println(current.value);
            current=current.next;
        }
    }


    public void reverseLL()
    {
        Node current=head;
        Node result=null;
        Node next;
        while (current!=null){
            next=current.next;
            current.next=result;
            result=current;
            current=next;
        }
        head=result;
    }

public void ReverseRecursive(Node curr){
    if(curr==null){
        return;
    }

    if(curr.next==null){
        this.head=curr;
        return;
    }
    ReverseRecursive(curr.next);
    curr.next.next=curr;
    curr.next=null;
}



    public void ReverseRecursive(){
        ReverseRecursive(head);
    }


    public static  void main (String[] args){

        ReverseLinkedList reverseLinkedList =new ReverseLinkedList();
        reverseLinkedList.insert(4);
        reverseLinkedList.insert((5));
        reverseLinkedList.insert(3);
        reverseLinkedList.insert((1));
        reverseLinkedList.insert(9);
        reverseLinkedList.insert(10);
        reverseLinkedList.insert(14);
        reverseLinkedList.insert((2));
        reverseLinkedList.display();
        reverseLinkedList.reverseLL();
        System.out.println("########  Reverse list #######");
        reverseLinkedList.display();
        System.out.println("######## recursive  Reverse list #######");
       reverseLinkedList.ReverseRecursive();
        reverseLinkedList.display();
    }
}
