


https://www.codechef.com/JUNE20B/problems/PRICECON

Problem from Codechef June challenge div2




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
			int K=sc.nextInt();
			
			int arr[]=new int[N];
			int arr2[]=new int[N];
			int sum1=0;
			int sum2=0;
			
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
				sum1+=arr[i];
				
				if(arr[i]>=K)
				sum2+=K;
				else
				sum2+=arr[i];
				
			}
			if(sum1>sum2)
			System.out.println(sum1-sum2);
			else
			System.out.println("0");
			
		}
	
	}
}
