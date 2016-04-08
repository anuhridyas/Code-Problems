package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 4/7/16.
 */
public class IsSubsequence {

    public static  boolean isSubsequence(String s1,String s2, int m, int n) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return isSubsequence(s1, s2, m - 1, n - 1);
           } else {
            return isSubsequence(s1,s2,m,n-1);
          }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be checked ");
        String str1=br.readLine();
        System.out.println("Enter the string is to which is to compared with for subsequence");
        String str2=br.readLine();
        if(isSubsequence(str1,str2, str1.length(),str2.length())){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
