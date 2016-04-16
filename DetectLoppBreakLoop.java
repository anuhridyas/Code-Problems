package com.company;

/**
 * Created by jiteshnambiar on 4/13/16.
 */
public class DetectLoppBreakLoop {

   static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }

    }
   static Node  head;

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }


    public static  void detectLoop(){
        Node slow=head;
        Node fast=head;
        int count=0;
        while(slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                System.out.println("loop found");
                break;
            }

        }

        if(fast==null || fast.next==null){
            System.out.println("loop doesnt exist");
            return;
        }

            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }


         System.out.println("The Loop starts at "+slow.value);
        fast=fast.next;
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;

    }

    public static  void main(String[] args){
        DetectLoppBreakLoop list=new DetectLoppBreakLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head;



        detectLoop();

        list.display();
    }
}
