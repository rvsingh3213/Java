
//https://www.codechef.com/HALO2020/problems/SIMNUM




/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	static long CalculateZ(String str)
	{     long sum=(long)str.length();
		int l=str.length();
		int left=0;
		int right=0;
		int Z[]=new int[l];
		Z[0]=0;
		for(int k=1;k<l;k++)
		{
			if(k>right)
			{
				left=right=k;
				
				while(right<l && str.charAt(right)==str.charAt(right-left))
				{
					right++;
				}
				Z[k]=right-left;
				right--;
				
			}
			else
			{
				int k1=k-left;
				if(Z[k1]<right-k+1)
				{
					Z[k]=Z[k1];
				}
				else{
					left=k;
					
					while(right<l && str.charAt(right)==str.charAt(right-left))
				{
					right++;
				}
			      	Z[k]=right-left;
				      right--;
				}
				
			
			}
		}
			for(int i=1;i<str.length();i++)
				{
				    sum+=Z[i];  
				}
		
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test>0)
		{	test--;
			String S=sc.next();
			
			
			System.out.println(CalculateZ(S));
		}
	}
}
