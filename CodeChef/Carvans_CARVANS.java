Problem Code: CARVANS

https://www.codechef.com/viewsolution/31363791


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
		int size;
		T=sc.nextInt();
		
		int k=0,max;
		for(int i=0;i<T;i++)
		{   max=0;
		    size=sc.nextInt();
		   int arr[]=new int[size];
		 
		    for(int j=0;j<size;j++)
		    {
		        arr[j]=sc.nextInt();
		        
		    }
		    int min=0;
		    for(int j=0;j<size;j++)
		    {
		        if(j==0)
    		   {      max=1;min=arr[j];  }
		        else if(arr[j]<min)
		         { max++;min=arr[j];  }
		    }
		       System.out.println(max);
		 
		 }
		   
		   //System.out.println(max);
		
	}
}
