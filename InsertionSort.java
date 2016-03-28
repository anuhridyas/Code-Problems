/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class InsertionSort
{
    public void sorting(int[] arr){
        int hole,value;
        for(int i=1;i<arr.length;i++)
        {
            value=arr[i];
             hole=i;
            while(hole>0 && arr[hole-1]>value)
            {
            arr[hole]=arr[hole-1];
            hole--;
            }
            arr[hole]=value;
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		InsertionSort inSort=new InsertionSort();
		int[] arr= {10,30,3,40,20,32,12};
	    inSort.sorting(arr);
	    for(Integer i:arr){
	        System.out.print(i+":");
	    }
	    
	}
}
