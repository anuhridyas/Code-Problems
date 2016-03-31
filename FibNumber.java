package com.company;

/**
 * Created by jiteshnambiar on 3/30/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 3/30/16.
 */
public class FibNumber {

    public static  int fib(int number ){
        if(number<=1){
            return number;

        }
        return fib(number-1)+fib(number-2);
    }

    public  static  int  fibDP(int number) {
        int[] fibArray = new int[number + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <=number; i++)
        {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
         }


    return fibArray[number];}

    public static int fibSpaceOpt(int number ){
        int a=0;
        int b=1;
        int c;
        if(number==0){
            return a;
        }

        for(int i=2;i<=number;i++){
            c=a+b;
            a=b;
            b=c;
        }
    return b;}


    public static  int  fibOptMult(int number ){

        if(number==0){
            return 0;
        }
         int[][] fib=  {{1,1},{1,0}};
         power(fib,number-1);

       return fib[0][0];
    }

    private static void  power(int[][] fib, int num){
        if(num==0 || num==1){
            return;
        }
        int[][]M={{1,1},{1,0}};
        power(fib,num/2);
        multiply(fib,fib);
        if(num%2!=0){
            multiply(fib,M);
        }
    }

    private static void multiply(int[][] F, int[][] M){
        int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
        int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
        int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
        int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int number=Integer.parseInt(br.readLine());
        System.out.println(fib(number));
        System.out.println(fibDP(number));
        System.out.println(fibSpaceOpt(number));
        System.out.println(fibOptMult(number));

    }
}
