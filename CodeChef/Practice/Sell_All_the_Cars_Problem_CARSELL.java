Sell All the Cars Problem Code: CARSELL


Problem Code: CARSELL

https://www.codechef.com/viewsolution/31869248

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
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   // int T=Integer.parseInt(br.readLine());
        
    //	
    int T=sc.nextInt();
   // System.out.println(T);
		for(int i=0;i<T;i++)
		{
			int n=sc.nextInt();
		//	System.out.println(n);
		   Integer arr[]=new Integer[n];
		   
		   for(int k=0;k<n;k++)
		   {
		       arr[k]=(Integer)sc.nextInt();
		      // System.out.print(arr[k]);
		   }
		    
			int val;
			long amount=0;
			
			Arrays.sort(arr,Collections.reverseOrder());
		   /* for(int l=0;l<n;l++)
	        System.out.println(arr[l]);
	       */
			
			for(int k=0;k<n;k++)
			{
				if((arr[k]-k)>0)
				amount+=(arr[k]-k);
			}
			int p=1000000007;
			System.out.println(amount%p);
		
		}
		
	}
}
