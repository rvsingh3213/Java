
//https://www.codechef.com/JULY20B/problems/CRDGAME

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	static int digSum(int A)
	{
		int sum=0;
		
		while(A>0)
		{
			sum+=A%10;
			A/=10;
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{	test--;
			
			int N=Integer.parseInt(bf.readLine());
			
			int chef=0;
			int monty=0;
			int A=0,B=0;
			for(int i=0;i<N;i++)
			{
				String line=bf.readLine();
				
				String str[]=line.trim().split("\\s+");
				
				A=Integer.parseInt(str[0]);
				B=Integer.parseInt(str[1]);
				
				A=digSum(A);
				B=digSum(B);
				
				if(A>B)
				{
					chef++;
				}
				else if(B>A)
				{
					monty++;
				}
				else
				{
					chef++;
					monty++;
				}
			}
			
			
			if(chef>monty)
			{
				System.out.println("0 "+chef);
				
			}
			else if(monty>chef)
			{
				System.out.println("1 "+monty);
			}
			else
				System.out.println("2 "+monty);
		}
			
	}
}
