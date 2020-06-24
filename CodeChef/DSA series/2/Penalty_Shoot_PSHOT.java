

https://www.codechef.com/LRNDSA02/problems/PSHOT

Penalty Shoot-Out II Problem Code: PSHOT



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

		for(int k=0;k<T;k++)
		{	int N=sc.nextInt();
			String s=sc.next();
			int A=0,B=0;
			int small=0;
			int i=0;
			 
					for(i=0;i<2*N;)
			{	
				if(i%2==0) 
				{	//if(s.charAt(i)=='1')
					A+=Integer.parseInt(String.valueOf(s.charAt(i)));
					
					if(A>(B+1+(2*N-i-1)/2))
					{ break;}
					if(B>(A+(2*N-i-1)/2))
					{
						break;
					}
					i++;
					
				}
			
				else
				{
					if(s.charAt(i)=='1')
						B++;
				    
				    
					if(B>(A+(2*N-i-1)/2))
					{break;}
					if(A>(B+(2*N-i-1)/2))
					{break;}
					i++;
						
				}
			}
			if(2*N==i)
			System.out.println(i);
			else
			System.out.println(i+1);
			 
		}
		}
	}

