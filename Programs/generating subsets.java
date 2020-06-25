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
		int N,K;
		for(int i=0;i<T;i++)
		{
			N=sc.nextInt();
			K=sc.nextInt();
			int arr[]=new int[N];
			
			for(int r=0;r<N;r++)
				{
					arr[r]=sc.nextInt();
			
				}	
			
			Arrays.sort(arr);
			int sum=0,min,count=0;
			
			long p_set=(long)Math.pow(2,N);
			
			for(int m=0;m<p_set;m++)
				{
						for(n=0;n<N;n++)
						{
							if(m &(1<<n))
								System.out.print(arr[n]+" ");
							
						}
						System.out.println("\n");
						
						
						
				}
			
				
		
		}
	}
}
