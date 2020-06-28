
//https://www.codechef.com/LTIME85B/problems/CHFMOT18/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		while(T>0)
		{T--;
			long S=sc.nextInt();
			long N=sc.nextInt();
			
			if(S==1)
			{	System.out.println("1"); continue;  }
			
			if(S==N)
			{	System.out.println("1"); continue;   }
			if(S>N)
			{
				long count=S/N;
				S=S%N;
				
				if(S%2==1)
				{
					if(S==1)
					count+=1;
					else
					count+=2;
				}
				else if(S%N==0)
				{
					
				}
				else
				{
					count++;
				}
				
				System.out.println(count); continue;
				
			}
			
			if(N>S)
			{
				if(S%2==0)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
			}
			
				
		}
		
	}
}
