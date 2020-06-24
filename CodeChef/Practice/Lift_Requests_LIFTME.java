Lift Requests Problem Code LIFTME

Problem Code: LIFTME

https://www.codechef.com/viewsolution/32114790

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
		
		
		for(int j=0;j<T;j++)
		{
			int N=sc.nextInt();
			int Q=sc.nextInt();
				int fi=0,di=0;
				int loc=0;
				long dis=0;
			for(int i=0;i<Q;i++ )
			{
				fi=sc.nextInt();
				di=sc.nextInt();
				
				
				dis+=Math.abs(loc-fi);
				loc=fi;
				dis+=Math.abs(di-fi);
				loc=di;
				
				
			}
			
			System.out.println(dis);
			
			
		}
	}
}
