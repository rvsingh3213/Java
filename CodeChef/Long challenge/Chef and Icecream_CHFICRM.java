

//https://www.codechef.com/JUNE20B/problems/CHFICRM
//Problem code:CHFICRM
//from codechef JuneChallenge div2


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
			int N=sc.nextInt();
			int arr[]=new int[N];
			int five=0;
			int f_15=0;
			int ten=0;
			int sum=0;
			int flag=1;
			for(int i=0;i<N;i++)
			{	arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<N;i++)
			{
			      if( (arr[0]==10) || (arr[0]==15) )
			      {
			            flag=0;
			            break;
			      }
			      
				if(arr[i]==5)
				{sum+=arr[i];
				five++;
				}
				else if(arr[i]==10)
				{     
					if(five>0)
					{  ten++;
						sum+=arr[i];
						sum-=5;
						five--;
						
						
					}
					else
					{
						flag=0;
						break;
					}
					
				}
				else if(arr[i]==15)
				{   
					if(sum>=10)
					{
						sum-=10;
						if(ten>0)
						{
							ten--;
						}
						else
						{
							five-=2;
						}
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			
			if(flag==1)
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	
	}
}
