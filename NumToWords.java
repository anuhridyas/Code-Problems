package com.company;

/**
 * Created by jiteshnambiar on 3/31/16.
 */
public class NumToWords {
    public static  String[] tens={"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public static String[] teens={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
    public static String[] digits={"one","two","three","four","five","six","seven","eight","nine"};
    public static String[] bigs={"","Thousand","Million"};

    public static String numToString(int number){
        if(number==0){
            return "Zero";
        }
        else if(number<0){
            return("Negative"+numToString(-1*number));
        }
        String str="";
        int count=0;
        while(number>0){
            if(number%1000>0){
                str=numToString100(number%1000)+bigs[count]+" "+str;
                number/=1000;
                count++;
            }
        }

    return str;}

    public static  String numToString100(int number){
        String str="";
        if(number>=100){
            str+=digits[number/100-1]+" Hundred ";
            number%=100;
        }
        if(number>=11 && number<=19){
          return str+teens[number-1] +" ";
        }
        else if(number==10 ||number>=20){
            str+=tens[number/10-1]+" ";
            number%=10;
        }

        if(number>=1&& number<=9){
            str+=digits[number-1]+" ";
        }

    return str;}

    public static void main(String[] args){
        System.out.println(numToString(1124));
    }
}
