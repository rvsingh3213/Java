Another Birthday Present! Problem Code SHUFFLE

Problem Code: SHUFFLE

https://www.codechef.com/viewsolution/32341682


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
		
		for(int z=0;z<T;z++)
		{	int flag=1;
			int N=sc.nextInt();
			int K=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
		
			for(int i=0;i<N-K;i++)
			{   
				
				for(int j=i+K;j<N;j+=K)
				{   
					
				    	if(arr[i]>arr[j])
				    	{	
						
						int l=arr[i];
						arr[i]=arr[j];
						arr[j]=l;
						
						
				    	}
				    	
						
					}
				}
				
			//int flag=0;
			
			for(int i=0;i<N-1;i++)
			{
				if(arr[i]>arr[i+1])
					{flag=0;break;}
				
			}
			if(flag==1)
				System.out.println("yes");
			else
				System.out.println("no");
			/*for(int i=0;i<N;i++)
			System.out.print(arr[i]+" ");
			*/
			}
}

}


