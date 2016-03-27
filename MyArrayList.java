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
    if (size==default_size-1)
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
       
        if(i<0 || i >size)
        {
        throw new IndexOutOfBoundsException();
        }
        
        for(int startingPoint=i;startingPoint<size;startingPoint++)
        {
           
          arr[startingPoint]=arr[startingPoint+1];
          
          
        }
        arr[size]=null;
        size--;
    }
    
    void clear()
    {
     for(int i=0;i<size;i++) {
         arr[i]=null;
     }  
     size=-1;
    }
    
    
   E get (int i)
   {
       if(i<0 || i>size)
       {
          throw new IndexOutOfBoundsException();
       }
      return(arr[i]);   
   }
    
    void set (int index,E value)
    {
        if(index<0 || index >size)
        {
         throw new IndexOutOfBoundsException();   
        }
        
        arr[index]=value;
    }
    
    public static boolean testArrayListAdd() {
        MyArrayList<String> arr = new MyArrayList<String>();
		arr.add("my");
	    return arr.size() == 1;
    }
    
    public static boolean testArrayListremove() {
        MyArrayList<String> arr = new MyArrayList<String>();
        arr.add("my");
        arr.remove(0);
        return arr.size() == 0;
    }
    
    
    
    public static boolean testArrayListGet() {
        MyArrayList<String> arr = new MyArrayList<String>();
        arr.add("my");
        return arr.get(0) == "my";
    }
    
    
    public static boolean testArrayListSet() {
        MyArrayList<String> arr = new MyArrayList<String>();
        arr.add("my");
        arr.set(0,"anu");
        return arr.get(0).equals("anu");
    }
    
    public static boolean testArrayListResize() {
        MyArrayList<String> arr = new MyArrayList<String>();
        arr.add("my");
        arr.set(0,"anu");
        
        for(int i = 0; i < 20; ++i) {
            arr.add(Integer.toString(i));
        }
        return arr.size()==21;
    }
  
  
   public static boolean testArrayListException() {
        boolean thrown = false;
    
        MyArrayList<String> arr = new MyArrayList<String>();
    	arr.add("my");
        arr.set(0,"anu");
        
        try {
            for(int i = 0; i < 20; ++i) {
                arr.remove((i));
            }
            for(int i = 0; i < arr.size(); ++i) {
                System.out.print(arr.get(i) + ", ");
            }
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        
        return thrown;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("testArrayListAdd:" + testArrayListAdd());
        System.out.println("testArrayListremove:" + testArrayListremove());
        System.out.println("testArrayListget:" + testArrayListGet());
        System.out.println("testArrayListset:" + testArrayListSet());
        System.out.println("testArrayListResize:" + testArrayListResize() );
        System.out.println("testArrayListException:" + testArrayListException() );
    }
}
