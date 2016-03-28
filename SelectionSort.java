/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SelectionSort
{
    
    public void sorting(int[] arr){
        int min;
        for(int i=0;i<arr.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		SelectionSort selSort=new SelectionSort();
		int[] arr= {10,30,3,40,20,32,12};
	    selSort.sorting(arr);
	    for(Integer i:arr){
	        System.out.print(i+":");
	    }
	}
}
