
//https://www.codechef.com/JAN19B/problems/HP18

//https://www.codechef.com/problems/HP18

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
		int test=sc.nextInt();
		
		while(test>0)
		{	test--;
	
			int N=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int arr[]=new int[N];
			
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			int count1=0;
			int count2=0;
			int count3=0;
			
			for(int i=0;i<N;i++)
			{     
			      if(arr[i]%a==0 && arr[i]%b==0)
			      count3++;
			      
				if(arr[i]%a==0 && arr[i]%b!=0)
					count1++;
				if(arr[i]%a!=0 && arr[i]%b==0)
					count2++;
			}
			
			if((count1+(count3))>count2)
				System.out.println("BOB");
			if((count1+count3)<=count2)
				System.out.println("ALICE");
			
				
		}
	}
}
