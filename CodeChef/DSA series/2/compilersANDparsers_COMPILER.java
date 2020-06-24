
Link to Problem
https://www.codechef.com/LRNDSA02/problems/COMPILER

Compilers and parsers Problem Code: COMPILER


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T>0)
		{	T--;
	
			String s=sc.next();
			char arr[]=s.toCharArray();
			int len=s.length();
			int i=0;
			int count=0;
			int rv1=0;
			int rv2=0;
			//System.out.println("len:"+len);
			while(i<len)
			{
				if(arr[i]=='<')
				{
					rv1++;
					
				}
				else
				{
				rv2++;
				//	System.out.println("arr["+i+"]:"+arr[i]);
				}
				if(rv1==rv2)
					count=rv1+rv2;
				if(rv2>rv1)
					break;
				
				i++;
			}
			
			System.out.println(count);
		
		}
		
	}
}
