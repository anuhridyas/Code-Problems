package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by jiteshnambiar on 4/5/16.
 */
public class Permuation {
    public static HashSet<String>  findPermutation(String str){
       HashSet<String> allPermuations =new HashSet<>();
        if(str==null || str.length()==0){
           allPermuations.add("") ;
            return allPermuations;
        }
        Character first=str.charAt(0);
        HashSet<String> remainingWords=findPermutation(str.substring(1));
        for(String word:remainingWords){
        for(int i=0; i<=word.length();i++){
            String suffix= word.substring(i);
            String  prefix=word.substring(0,i);
            allPermuations.add(prefix+first+suffix);
        }
        }
        return allPermuations;
    }

    public static void heapPermutation(char[] str, int n){
        if(n==1){
           System.out.print(Arrays.toString(str));
            return;
        }
        else
        {
        for(int i=0;i<n;i++){
            heapPermutation(str, n-1);
            if(n%2==0){
                swap(str,i,n-1);
            }else{
                swap(str,0,n-1);
            }
        }

        }
    }

    private static  void  swap(char[] s,int i,int n){
        Character temp=s[n];
        s[n]=s[i];
        s[i]=temp;

    }

    public static void combination(String str){
        StringBuffer output=new StringBuffer(str.length());
        combination(str,output,str.length(),0);

    }



    public static  void combination(String str,StringBuffer output,int length,int startingPoint){

        if(startingPoint==length){
            return;
        }
        else{
        for(int curr=startingPoint;curr<str.length();curr++){
            output.append(str.charAt(curr));
            System.out.println(output);
            combination(str,output,length,curr+1);
            output.deleteCharAt(output.length()-1);
        }
        }
    }

    public static void  bracket(String output,int open,int close,int number){
        if(open==number && close==number){
            System.out.println(output);
            return;
        }
        else
        {
            if(open<number){
                bracket(output+"{",open+1,close,number);
            }if(close<open){
            bracket(output+"}",open,close+1,number);
        }
        }
    }


    static  void printCombinations(String letters, int length, String prefix)
    {
        if (length == 0)
        {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < letters.length(); i++)
        {
            String newPrefix = prefix + letters.charAt(i);
            printCombinations(letters, length - 1, newPrefix);

        }
    }

     public static void rCombinations(String str,int r){
         StringBuffer sb=new StringBuffer(r);
         rCombinations(str,r,0,sb);
     }

    public static void rCombinations(String s,int r ,int startingPoint,StringBuffer output){
        if(output.length()==r){
            System.out.println(output);
            return;
        }
        else {
            for(int curr=startingPoint;curr<s.length();curr++){
                output.append(s.charAt(curr));
                rCombinations(s,r,curr+1,output);
                output.deleteCharAt(output.length()-1);
            }
        }
    }


    public static  void permutationWithSpace(StringBuffer str){

        permutationWithSpace(str,1, str.length());
    }

    public static  void permutationWithSpace(StringBuffer s,int startingPoint,int length){

            for(int curr=startingPoint;curr<length;curr++){
                //insert st curr instances here in first case curr=1 sp - this comes after 1
                s.insert(curr,'_');
                System.out.println(s);
                permutationWithSpace(s,curr+2,s.length());
                s.delete(curr,curr+1);
            }

    }

    public static void palindromicPermutation(String str,int n){
        boolean odd=false;

        if(n%2!=0){
           odd=true;
        }
        ArrayList<String> J=palindromicPermutation(str,odd,"",n);
        for(String w:J){
            System.out.println(w);
        }
    }


    public static ArrayList<String> palindromicPermutation(String str, boolean odd, String dest, int length){
        if(dest==null){
            return null;
        }
        if(dest.length()==length){
            ArrayList<String> currPalindrome=new ArrayList<>();
            currPalindrome.add(dest);
            return currPalindrome;
        }
        ArrayList<String> allPalindromes=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            String temp=new String();
            if(dest.isEmpty() && odd){
                temp= dest +str.charAt(i);
            }
            else {
                temp=str.charAt(i)+dest+str.charAt(i);
            }
            ArrayList<String> tempList=new ArrayList<>();
            tempList=palindromicPermutation(str,odd,temp,length);
            allPalindromes.addAll(tempList);

        }


    return  allPalindromes;}


    public static void main(String[] args){
        HashSet<String> list=findPermutation("abc");
        for(String s:list){
            System.out.println(s);
        }

        heapPermutation("abc".toCharArray(),3);
        System.out.println();
        System.out.println("######combination######");
        combination("abcdg");
        bracket("",0,0,3);
        /*combination with 2 with starting repeated*/
        printCombinations("abc",2,"");
        /*Combination with size r  */
        System.out.println("######  R length combination  ######");
        rCombinations("abcdg",4);
        StringBuffer sb=new StringBuffer("abcd");
        System.out.println("String with characters");
        permutationWithSpace(sb);
        palindromicPermutation("ab",3);
    }
}
