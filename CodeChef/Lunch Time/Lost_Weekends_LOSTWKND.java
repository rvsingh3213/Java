

//https://www.codechef.com/LTIME84B/problems/LOSTWKND

Lost Weekends Problem Code: LOSTWKND




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
		
		while(T>0)
		{	T--;
	
			int arr[]=new int[5];
			int total=0;
			for(int i=0;i<5;i++)
			{arr[i]=sc.nextInt();
				total+=arr[i];
			}
			int P=sc.nextInt();
			if(P*total<=120)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}
