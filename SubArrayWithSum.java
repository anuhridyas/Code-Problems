package com.company;

/**
 * Created by jiteshnambiar on 4/15/16.
 */
public class SubArrayWithSum {
    public static  void subArrayWithSum(int[] arr,int sum){
        int startPos=0;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            while(currSum>sum  && startPos<i){
                currSum-=arr[startPos];
                startPos++;
            }
            if(currSum==sum){
                System.out.println("SubAarray with sum found  with start position "+startPos+" end Position "+i );
                return;
            }



        }

      System.out.println("no sub array found");

    }

    public static  void main(String[] args){
        int[] arr={9,8,-5,5,0};
        subArrayWithSum(arr,0);
    }
}
