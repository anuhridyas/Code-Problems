package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by anu on 3/29/16.
 */
public class PowInLogN {

    public  int calculatePower(int x,int y ){
        if (y==0){
            return 1;
        }
        int temp=calculatePower(x,y/2);
        if(y%2==0)
        {
            return temp*temp;
        }
        else
        {
            if(y>0) {
                return x * temp * temp;
            }
            else{
                return((temp*temp)/x);
            }
        }
    }
    public static  void  main (String[] args) throws IOException{
        PowInLogN pow=new PowInLogN();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of x ");
        int x=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of y ");
        int y=Integer.parseInt(br.readLine());
        System.out.println(pow.calculatePower(x,y));
    }
}
