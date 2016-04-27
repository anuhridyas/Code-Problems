package com.company;

/**
 * Created by jiteshnambiar on 4/25/16.
 */
public class BitonicSequence {



    public static  void findLengthofBitonicSequence(int[] arr){


        if(arr == null || arr.length == 0) {
           return ;
        }

        int[] ils= new int[arr.length];
        int[] ids=new int[arr.length];
        int maxLength=1;
        for(int i=0;i<arr.length;i++){
            ils[i]=1;
            ids[i]=1;
        }


        for(int i=1;i<arr.length;i++){
            {
                for(int j=0;j<i;j++){
                    if(arr[i]>arr[j]   && ils[i]<ils[j]+1){
                        ils[i]=ils[j]+1;
                    }
                }
            }
        }



        for(int i=arr.length-2;i>=0;i--){
            for(int j=arr.length-1;j>i;j--){
                if(arr[i]>arr[j]  && ids[i]<ids[j]+1){
                    ids[i]=ids[j]+1;
                }
            }
        }


 for(int i=0;i<arr.length;i++){
    if( maxLength<ils[i]+ids[i]-1){
        maxLength=ils[i]+ids[i]-1;
    }
 }


System.out.println(maxLength);



    }
    public static void main(String[] args){
        int[] arr= {12, 18, 7, 34, 30, 28, 90, 88};
        findLengthofBitonicSequence(arr);
    }
}
