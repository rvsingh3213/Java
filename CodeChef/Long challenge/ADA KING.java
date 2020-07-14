
//https://www.codechef.com/JULY20B/problems/ADAKING



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
			
			int k=Integer.parseInt(bf.readLine());
			
			int i=1,j=1;
			int flag=0;
			char arr[][]=new char[9][9];
			for( i=1;i<=8;i++)
			{	
				
				for(j=1;j<=8;j++)
				{	if( (i==1) && (i==j) )
					{
						System.out.print("O");k--;
						continue;
					}
					if(k>0)
					{System.out.print(".");
						k--;
					}
					else
					{ flag=1;break;}
				
				
				}
				if(flag==1)
					break;
				
				System.out.println();
			}
			//System.out.print("i:"+i+" j:"+j);
			
			
			int kk=j;
			for(;j<=8;j++)
				System.out.print("X");
			
			if((i==8) && (j==8) )
				continue;
			
			System.out.println();
			i++;
			if(i<=8)
			for(j=1;j<=kk;j++)
				System.out.print("X");
			
			for(;i<=8;i++)
			{	for(;j<=8;j++)
				{
					System.out.print(".");
				}
				j=1;
				System.out.println("");				
			}
			
			//System.out.print("i:"+i+" j:"+j);
			
			
			
			
			
		}
			
	}
}
