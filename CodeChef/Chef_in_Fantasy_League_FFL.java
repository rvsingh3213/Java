Chef in Fantasy League Problem Code FFL


Problem Code: FFL

https://www.codechef.com/viewsolution/32247796

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
		
		for(int z=0;z<T;z++)
		{
			int N=sc.nextInt();
			int S=sc.nextInt();
			
			int arr[][]=new int[2][N];
			
			for(int i=0;i<N;i++)
				arr[0][i]=sc.nextInt();
			
			for(int i=0;i<N;i++)
				arr[1][i]=sc.nextInt();
			
			int zp=100;
			int op=100;
			for(int i=0;i<N;i++)
			{
				if(arr[1][i]==0)
				{
					if(arr[0][i]<zp)
						zp=arr[0][i];
				}
				if(arr[1][i]==1)
				{
					if(arr[0][i]<op)
						op=arr[0][i];
				}
			}
			if((S+op+zp)<=100)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
	}
}
