
//https://www.codechef.com/problems/DECOGCD

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	static int GCD(int a,int b)
	{
	      if(a==0)
	         return b;
	         
	        return GCD(b%a,a);
	        //alt for GCD
		/*if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		
		if(a>b)
			return GCD(a%b,b);
		else
			return GCD(a,b%a);
			*/
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{	test--;
			
			int N=Integer.parseInt(bf.readLine());
			
			String line=bf.readLine();
			String str[]=line.trim().split("\\s+");	
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(str[i]);
			}
			int count=0;
			int rv=0;
			int A=arr[0];
			for(int i=0;i<N;i++)
			{
				A=arr[i];
				rv=GCD(rv,A);
				
				if(rv==1)
				{
					rv=0;
					count++;
				}
			
			}
			System.out.println(count);
			
		}
			
	}
}

















