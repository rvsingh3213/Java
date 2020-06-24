

https://www.codechef.com/LRNDSA02/problems/STUPMACH


Stupid Machine Problem Code: STUPMACH


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
		int T=sc.nextInt();
		
		while(T>0)
		{	T--;
			int N=sc.nextInt();
			int arr[]=new int[N];
			int small=Integer.MAX_VALUE;
			long sum=0;
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]<=small)
				{
					small=arr[i];
					sum=sum+arr[i];
					
				}
				else
				{
				      sum+=small;
				}
				
			}
			
			System.out.println(sum);			
			
		}
	}
}
