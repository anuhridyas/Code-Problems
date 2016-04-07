package com.company;

/**
 * Created by jiteshnambiar on 4/6/16.
 */
public class InterLeaving {


    public static void printAllInterleaving(String s1,String s2){
        printAllInterleaving(s1,s2,"");
    }

    public static  void printAllInterleaving(String s1,String s2,String soFar){
        if((s1.length()==0 || s1==null )&& (s2.length()==0 || s2==null)){
            return ;
        }
        if(s1.length()==0 || s1==null){
            System.out.println(soFar+s2);
            return;
        }
        if(s2.length()==0 || s2==null){
            System.out.println(soFar+s1);
            return;
        }
        printAllInterleaving(s1.substring(1),s2,soFar+s1.charAt(0));
        printAllInterleaving(s1,s2.substring(1),soFar+s2.charAt(0));
    }

    public static void main(String[] args){
        String first="ab";
        String second="cd";
        printAllInterleaving(first,second);
    }
}
