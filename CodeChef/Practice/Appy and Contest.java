
//https://www.codechef.com/FEB19B/problems/HMAPPY2
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static long gcd(long A,long B)
	{
		
		if(A==B)
		      return A;
		
		if(A>B)
			return gcd(A%B,B);
		else
			return gcd(B%A,A);
		
	}
	
	static long lcm(long A,Long B)
	{
		return ((A*B)/(gcd(A,B)));
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test>0)
		{	test--;
	
			long N=sc.nextLong();
			long A=sc.nextLong();
			long B=sc.nextLong();
			long K=sc.nextLong();
			
			long gg=lcm(A,B);
			
			long result=(N/A + N/B -2*(N/gg));
			
			if(result>=K)
				System.out.println("Win");
			else
				System.out.println("Lose");
			
			
		
		}
	}
}
