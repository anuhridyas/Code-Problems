package com.company;

import java.util.Random;

import static com.company.QuickSelect.quickSort;

/**
 * Created by jiteshnambiar on 4/12/16.
 */
public class QuickSelect {


    public static  int kthElement(int[] arr,int start,int end,int k){
       int pivot=partition(arr,start,end);
        if(pivot==k){
          return(arr[pivot]);
        }
        else if(pivot>k){
           return kthElement(arr,start,pivot-1,k);
        }
        else {
            return kthElement(arr,pivot+1,end,k);
        }
    }
    private static int partition(int[] arr,int start,int end){
        int pIndex=start+ new Random().nextInt(end-start+1);
        int storeIndex=start;
        swap(arr,pIndex,end);
        for(int i=start;i<end;i++){
            if(arr[i]<arr[end]){
                swap(arr,i,storeIndex);
                storeIndex++;
            }
        }

         swap(arr,storeIndex,end);
        return  storeIndex;

    }


    public  static  void  quickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot=partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }


    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static  void main(String[] args){
        int[] arr={4, 2, 6, 1, 7, 3, 5};
        //kth  smallest
        int k=7;
        if(k<=arr.length)
        {
         //kth smallest
        System.out.println(kthElement(arr,0,arr.length-1,k-1));
        //kth largest
        System.out.println(kthElement(arr,0,arr.length-1,arr.length-k));}

        quickSort(arr,0,arr.length-1);
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }

}
