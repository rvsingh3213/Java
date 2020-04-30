Reverse The Number Problem Code FLOW007


Problem Code: FLOW007


https://www.codechef.com/viewsolution/31360608


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
	int T;
	T=sc.nextInt();
	int num;
	int rev,rem;
	for(int i=0;i<T;i++)
	{
	    num=sc.nextInt();
	  rev=0; 
	 while(num!=0)
	 {
	    rem=num%10;
	   
	    rev=rev*10+rem;
	    num=num/10;
	 }
	System.out.println(rev);
	    
	}
	    
	    
	}
	
}
