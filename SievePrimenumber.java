package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 3/29/16.
 */
public class SievePrimenumber {

    public  void findAllPrime(int n){
        int prime[]=new int[n+1];
        prime[0]=0;
        prime[1]=0;

        for (int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==0){
                for(int j=2;i*j<=n;j++){
                    prime[i*j]=1;
                }
            }
        }
        for(int i=0;i<prime.length;i++){
            if(prime[i]==0){
                System.out.println(i);
            }
        }

    }

    public static void main (String[] args) throws IOException{
        SievePrimenumber primenumber=new SievePrimenumber();
        System.out.println("enter a number ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        primenumber.findAllPrime(number);

    }
}
