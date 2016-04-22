package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 4/21/16.
 */
public class LongestPalindrome {


    public static String lonegestPalindrome(String str){


        if(str==null){
            return null;
        }

        if(str.length()==1){
            return str;
        }

        String longest=str.substring(0,1);
        for(int i=0;i<str.length();i++){
            String temp=helper(str,i,i);
                    if(temp.length()>longest.length()){
                        longest=temp;
                    }

             temp=helper(str,i,i+1);
            if(temp.length()>longest.length()){
                longest=temp;
            }

        }
    return longest;
    }



    private static  String helper(String  str,int start,int end){
        while(start>=0 && end<=str.length()-1 && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }

   return(str.substring(start+1,end)); }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // String str=br.readLine();
        System.out.println(lonegestPalindrome("maamk"));
    }
}
