package com.company;

import java.util.Stack;

/**
 * Created by jiteshnambiar on 4/15/16.
 */
public class SortStack {


    public static  void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        if(!stack.isEmpty()){
            int temp=stack.pop();
            sortStack(stack);
            sortedInsert(temp,stack);
        }

    }


    public static  void sortedInsert(int value,Stack<Integer> stack){
        if(stack.isEmpty()  || value<stack.peek()){
            stack.push(value);
            return;
        }
        else{
            int temp=stack.pop();
            sortedInsert(value,stack);
            stack.push(temp);
        }

    }


    public static  void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        else{
           int temp=stack.pop();
            reverseStack(stack);
            reverseInsert(temp,stack);
        }
    }

    private static  void reverseInsert(int value,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        else {
            int temp=stack.pop();
            sortedInsert(value,stack);
            stack.push(temp);
        }


    }




    public static  void main (String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(76);
        stack.push(9);
        stack.push(100);
        stack.push(20);
        stack.push(45);
        stack.push(99);
        reverseStack(stack);
        sortStack(stack);
        System.out.println();
        while(!stack.isEmpty()){
           System.out.println( stack.pop());
        }
    }
}
