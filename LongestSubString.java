package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 4/21/16.
 */
public class LongestSubString {
    public static void findLongestSubstring(String str){
        String longest="";
        boolean[] count=new boolean[256];
        for(int i=0;i<count.length;i++){
            count[i]=false;
        }
        int maxLength=1;
        int len=1;
        int i=0;
        int j=1;
        int startingIndex=0;
        int endingIndex=0;
        int start=0;
        do{

            if(  str.charAt(i)!=str.charAt(j)   && !count[str.charAt(j)]   ){
                count[str.charAt(j)]=true;
                len++;
                if(len>maxLength){
                    startingIndex=start;
                    maxLength=len;
                    endingIndex=j;
                }
                j++;
            }else{
                i=i+1;
                len=1;

                count[str.charAt(j)]=false;
                j=i+1;
                start=i;
            }
        }while(j<str.length());


System.out.println("the maximum length substring is "+maxLength +" from index "+startingIndex+" ending endex "+endingIndex);

    }




    public static  void main (String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string to be checked");
        String str=br.readLine();
        findLongestSubstring(str);
    }
}
