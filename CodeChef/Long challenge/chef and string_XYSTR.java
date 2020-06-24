
//https://www.codechef.com/JUNE20B/problems/XYSTR/

//XYSTR Problem from codechef june long challenge

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
			int Count=0;
			String S=sc.next();
			int N=S.length();
			char arr[]=S.toCharArray();
			
			for(int i=0;i<N-1;i++)
			{	
				if(  ( (arr[i]=='x') && (arr[i+1]=='y') )
				  || ( (arr[i]=='y') && (arr[i+1]=='x') )
				   )
				   {
					   Count++;
					   arr[i]='n';
					   arr[i+1]='n';
				   }
				   
			}
			System.out.println(Count);
			
		}
	
	}
}
