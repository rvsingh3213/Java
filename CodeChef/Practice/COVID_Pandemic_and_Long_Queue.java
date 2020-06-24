COVID Pandemic and Long Queue Problem Code: COVIDLQ

Problem Code: COVIDLQ


https://www.codechef.com/viewsolution/31895375

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
	    //	System.out.println(T);
		int count_z=0,count_o=0,flag=0,answer=1;
		for(int i=0;i<T;i++)
		{
		  int n=sc.nextInt();
		  // System.out.println(n);
		  int arr[]=new int[n]; 
			answer=1; flag=0;
			count_o=0;
			 for(int k=0;k<n;k++)
		    {
			 arr[k]=sc.nextInt();
			 if(answer==1)
			 {
					if((arr[k]==0) & (flag==0))
					{continue;}
		 
					if((arr[k]==1) &(flag==0))
					{flag=1; continue;
					}
			 
					if((arr[k]==0) & (flag==1))
					count_o++;
			 
					if((arr[k]==1)  & (flag==1))
					{
						if(count_o<5)
						{   answer=0; 
					// System.out.println("NO");break;
						}
						if(count_o>=5)
						{   answer=1;
							count_o=0;flag=1;
						}
			         }
			 }
	    	}
			if(answer==1)
			 System.out.println("YES");
			 else
			 System.out.println("NO");
		}
	}
}
