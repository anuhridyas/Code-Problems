/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BubbleSort
{
    
    public void sorting(int[] arr){
        boolean flag=true;
        if(arr==null||arr.length<2){
            return;
        }
        int n=arr.length;
        while(flag){
            flag=false;
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    flag=true;
                    swap(arr, j-1, j);
               }
                
            }
            n--;
        }
    }
    
     private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;     
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		BubbleSort bubSort=new BubbleSort();
		int[] arr= {10,30,3,40,20,32,12};
	    bubSort.sorting(arr);
	    for(Integer i:arr){
	        System.out.print(i+":");
	    }
		
	}
}
