import java.util.*;
import java.lang.*;
import java.io.*;

class Palindrome
{
    
    public static boolean checkPalindrome(String s)
    {
    	if (s.length() ==1 || s.length()==0)
    	    return true;
    	    
    	if (s.charAt(0)!=s.chaarAt(s.length()-1))
    	{
    	    return false;
    	}
	
        return checkPalindrome(s.substring(1,s.length()-1));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Input the String to be checked");
	    String s =br.readLine();
	    if(checkPalindrome(s))
	    {
	        System.out.println("String is a palindrome ");
	    }
	    else 
	    {
	        System.out.println("sTRING IS NOT A palindrome ");
	    }
	    
	    
	}
}
