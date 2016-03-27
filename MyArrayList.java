/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyArrayList<E> //throws Exception
{
    private  int default_size=10;
    private E arr[];
    private  int size=-1;
    
    
     public MyArrayList()
    {
      arr = (E[])new Object[default_size];
    }
    
    
     public MyArrayList(int s)
    {
      default_size=s;  
      arr = (E[])new Object[default_size];
    }
    
    void add (E e)
    {
    if (size==default_size)
    {
        resize();
    }
    size++;
    arr[size]=e;
    
    }
    
    
    void resize()
    {
        int size_d=2*default_size;
        arr = Arrays.copyOf(arr, size_d);
        default_size=size_d;
        
    }
    
    int size()
    {
        return size+1;
    }
    
    void remove( int i )
    {
        if(i<0 || i >=default_size){
        throw new IndexOutOfBoundsException();
        }
        for(int startingPoint=i;startingPoint<default_size;startingPoint++)
        {
          arr[startingPoint]=arr[startingPoint+1];
          
          
        }
        //arr[size]=null;
        size--;
    }
    
    void clear()
    {
     for(int i=0;i<size;i++) {
         arr[i]=null;
     }  
     size=0;
    }
    
    
   E get (int i)
   {
       if(i<0 && i>size)
       {
          throw new IndexOutOfBoundsException();
       }
      return(arr[i]);   
   }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		MyArrayList<String> arr = new MyArrayList<String>();
		arr.add("ww");
		arr.add("yy");
	    int Y=arr.size();
	    System.out.println(Y);
	    for(int i = 0; i < arr.size(); i++) {
	        System.out.println(arr.get(i));
	    }
	    boolean thrown = false;

        try {
            System.out.println(arr.get(4));
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
    
        System.out.println(thrown);
    }
}
