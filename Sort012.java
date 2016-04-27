package com.company;

import java.util.Arrays;

/**
 * Created by jiteshnambiar on 4/26/16.
 */
public class Sort012{


    public static  void sort012(int[] arr){


        int low=0,mid=0;
        int high=arr.length-1;
        while(mid<high){
            switch(arr[mid]){
                case 0:
                    swap(arr,mid,low);
                    low++;
                    mid++;
                break;
                case 1:
                    mid++;
                break;
                case 2:
                    swap( arr,high,mid);
                            high--;
                    break;
            }
        }
    }

    private static  void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }

    public static  void main(String[] args){
        int[] arr={1,1,0,2,1,1,0,1,2,2,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }


}
