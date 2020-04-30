

Problem Code: ZCO14003
https://www.codechef.com/viewsolution/31362940
*****************

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
		long arr[]=new long[T];
		
		for(int i=0;i<T;i++)
		{
		   arr[i]=sc.nextLong();
		  
		}
		
		long L=0;
		Arrays.sort(arr);
		for(int i=0;i<T;i++)
		{
		  L=Math.max(L,(T-i)*arr[i]);
		   // System.out.println(arr[i]);
		   //System.out.println(L);
		}
		
		System.out.println(L);
		
	}
}
