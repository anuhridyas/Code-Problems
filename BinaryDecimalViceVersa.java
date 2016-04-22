package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jiteshnambiar on 4/19/16.
 */
public class BinaryDecimalViceVersa {
    public  int convertToDecimal(int number){
        int decimal=0;
        int lastDigit;
        int power=0;
        while(number!=0){
            lastDigit=number%10;
            decimal+=lastDigit*Math.pow(2,power);
            power++;
            number/=10;
        }

    return decimal;
    }

    public String convertToBinary(int number){
        String binary="";
        int lastdigit=0;
        while(number!=0){
          lastdigit=number%2;
            binary= lastdigit+binary;
            number/=2;
        }

    return binary;
    }


    public static  void main(String[] args) throws IOException{
        BinaryDecimalViceVersa binaryDecimalViceVersa=new BinaryDecimalViceVersa();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the binary number");
        int number=Integer.parseInt(br.readLine());
        System.out.println(binaryDecimalViceVersa.convertToDecimal(number));
        System.out.println("enter the decimal number");
        int decimalNumber=Integer.parseInt(br.readLine());
        System.out.print(binaryDecimalViceVersa.convertToBinary(decimalNumber));



    }
}
