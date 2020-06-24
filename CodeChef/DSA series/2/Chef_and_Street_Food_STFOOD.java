Chef and Street Food Problem Code STFOOD


Problem Code: STFOOD

https://www.codechef.com/viewsolution/32436756

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
	
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		 
		while(t-->0)
		{
		    int i;
		    int n=in.nextInt();
		    int res=-1;
		    while(n-->0)
		    {
		        int s=in.nextInt();
		        int p=in.nextInt();
		        int v=in.nextInt();
		        res=Math.max(res,(p/(s+1))*v);
		        
		    }
		    System.out.println(res);
		    }
		}
		
		catch(Exception e)
		{
		    return;
		}
	}
}
