package com.company;

/**
 * Created by jiteshnambiar on 4/7/16.
 */
public class AllSubStrings {

    public static  void printAllSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=1;j<=str.length()-i ;j++){
                System.out.println(str.substring(i,j+i));
            }
        }
    }
    public static  void main(String[] args){
        printAllSubStrings("anuhridya");
    }
}
