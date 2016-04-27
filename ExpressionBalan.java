package com.company;

import sun.util.resources.cldr.ga.CalendarData_ga_IE;

import java.util.Stack;

/**
 * Created by jiteshnambiar on 4/26/16.
 */
public class ExpressionBalan {
    public static  boolean checkValid(String exp){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
           if(exp.charAt(i)=='{' || exp.charAt(i)=='('  || exp.charAt(i)=='['){
               stack.push(exp.charAt(i));
           }else if(exp.charAt(i)=='}' || exp.charAt(i)==')' || exp.charAt(i)==']'){
               if(stack.isEmpty()  || !arePairs(exp.charAt(i),stack.peek())){
                   return false ;
               }
               else{
                   stack.pop();
               }
           }
        }

    return stack.isEmpty()?true:false;
    }


    private static  boolean arePairs(char x,char y){
        if(x=='}'  && y=='{') {
            return true;
        }else if(x==']' && y=='[') {
           return true ;
        }else if(x==')' && y=='('){
            return true;
        }

    return false;}


    public static  void main (String[] args){
        String expr="(a+b)";
        if(checkValid(expr)){
            System.out.println("expression is valid ");
        }
        else {
            System.out.println("expression is not valid ");
        }
    }
}
