package com.company;

/**
 * Created by jiteshnambiar on 4/19/16.
 */
public class Merge2sortedArray {
      public static  void merge2SortedArrays(int[] arr1,int[] arr2){
      int secondIndex=arr2.length-1;
      int firstIndex=arr1.length-arr2.length-1;
      int mergeIndex=firstIndex+secondIndex+1;
         
         
         while( firstIndex>=0 && secondIndex>=0 )
         {
            if(arr1[firstIndex]>=arr2[secondIndex]){
             arr1[mergeIndex]=arr1[firstIndex];
             firstIndex--;
             mergeIndex--;
            }
             else {
                arr1[mergeIndex]=arr2[secondIndex];
                secondIndex--;
                mergeIndex--;
            }
         }
         
         while(secondIndex>=0){
             arr1[mergeIndex]=arr2[secondIndex];
             mergeIndex--;
             secondIndex--;
         }
     }

    public static void main (String[] args){
            int[] arr1=new int[8];
            arr1[0]=5;
            arr1[1]=8;
            arr1[2]=9;
            arr1[3]=10;
            int [] arr2={2,4,6,7};
            merge2SortedArrays(arr1,arr2);
            for(int i:arr1){
            System.out.println(i);
            }
    }   
}
