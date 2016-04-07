package com.company;

/**
 * Created by jiteshnambiar on 4/6/16.
 */
public class CatalanNumber {

    public static void findCatalan(int number){
        int[] catalan= new int[number+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=number;i++){
            catalan[i]=0;
            for(int j=0;j<i;j++){
                catalan[i]+=catalan[j]*catalan[i-j-1];
            }
        }
        //System.out.println(catalan[number]);
        if(number%2==0){
            System.out.println(catalan[number]/2);
        }
        else {
            System.out.println(0);
        }
    }
    public static void main(String[] args){
        findCatalan(6);
    }
}
