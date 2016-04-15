package com.company;

/**
 * Created by jiteshnambiar on 4/15/16.
 */
public class KadaneAlg {

    public static  void maximumSum(int[] arr){
        int maxSum=0;
        int maxNegativeSum=Integer.MIN_VALUE;
        int CurrSum=0;
        boolean hasAllnegative=true;
        int startPosition=0;
        int endPosition=0;
        int currStartIndex=0;


        for(int i=0;i<arr.length;i++){
            if(hasAllnegative && arr[i]<0 && maxNegativeSum<arr[i]){
               maxNegativeSum+=arr[i];
            }
            else  {
                hasAllnegative=false;
                CurrSum+=arr[i];
            }

            if(CurrSum>maxSum){
                maxSum= CurrSum;
                endPosition=i;
                startPosition=currStartIndex;

            }
            if(CurrSum<0){
                CurrSum=0;
                currStartIndex=i+1;

            }


        }
       if(!hasAllnegative){
           System.out.println("max sum  : "+maxSum);
           System.out.println("start position : "+startPosition);
           System.out.println("end position : "+endPosition);
           }
       else{
            System.out.print(maxNegativeSum);
        }

    }

    public static  void main (String[] args){
        int[] arr={2, 3, -4, -1, -2, 1, -5, -3};
        maximumSum(arr);
    }
}
