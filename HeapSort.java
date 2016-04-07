package com.company;

/**
 * Created by jiteshnambiar on 4/7/16.
 */
public class HeapSort {

    public static  void sort(int [] arr){
        int heapsize=arr.length;
         int startingPoint=(heapsize-1)/2;
        for(int i=startingPoint;i>=0;i--){

            heapify(i,arr,heapsize);
        }

        for(int i=heapsize-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapsize--;
            heapify(0,arr,heapsize);

        }

    }


    public  static  void heapify(int i,int[] arr,int heapSize){
        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int largest=i;

        if(leftChild<heapSize  && arr[leftChild]>arr[largest]){
            largest=leftChild;
        }
        if(rightChild<heapSize  && arr[rightChild]>arr[largest]){
            largest=rightChild;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(largest,arr,heapSize);
        }

    }
    public static void main (String[] args){
        int[]  arr={67,89,23,98,100,29,98,34,12};
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
