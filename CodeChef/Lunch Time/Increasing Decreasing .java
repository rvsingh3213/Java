
// https://www.codechef.com/LTIME85B/problems/INCRDEC



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	
	

	public static void main (String[] args) throws java.lang.Exception
	{	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{test--;
			
			int N=Integer.parseInt(bf.readLine());
			
			int max=Integer.MIN_VALUE;
			
			int arr[]=new int[200001];
			String line=bf.readLine();
			String s[]=line.trim().split("\\s+");
			int A=0;
			int flag=0;
			for(int i=0;i<s.length;i++)
			{
				A=Integer.parseInt(s[i]);
				//System.out.print(A+" ");
				arr[A]++;
				if(arr[A]>2)
				{ flag=-1;
				   
				}
				if(A>max)
					max=A;
			}
			/*for(int i=0;i<5;i++)
				System.out.print(arr[i]+" ");
			*/
			if(arr[max]>1)
			{System.out.println("NO"); continue;}	
			if(flag==-1)
			{System.out.println("NO"); continue;}
		
			{System.out.println("YES"); }
			for(int i=1;i<200001;i++)
			{
				if(arr[i]>0)
					System.out.print(i+" ");
				arr[i]--;
			}
			for(int i=200000; i>0;i--)
			{
				if(arr[i]>0)
					System.out.print(i+" ");	
			}
			
			System.out.println();
		}	
		
	}
}
	