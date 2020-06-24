//https://www.codechef.com/HALO2020/problems/MINIST

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
		
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int arr[]=new int[N+1];
	
			for(int i=1;i<=M;i++)
			{
				int vi=sc.nextInt();
				int ui=sc.nextInt();
				int wi=sc.nextInt();
				
				arr[ui]=arr[ui]+wi;
				arr[vi]=arr[vi]-wi; 
				//System.out.println("arr1:"+arr[vi]+"\narr2:"+arr[ui]);
				
			}
			Long sum=0L;
		/*	 for(int i=0;i<=M;i++)
		{    System.out.print(arr[i]+" ");}*/
			for(int i=1;i<=N;i++)
			{
				if(arr[i]>0)
				sum+=arr[i];
			}
	
			System.out.println(sum);
			
		
	}
}
