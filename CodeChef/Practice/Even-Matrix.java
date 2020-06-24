

//https://www.codechef.com/problems/EVENM

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
	
			int num=sc.nextInt();
			int arr[][]=new int[num][num];
			
			int number=1;
			for(int i=0;i<num;i++)
			{	int t=num-1;
				for(int j=0;j<num;j++)
				{	
					if(i%2==0)
					{
						arr[i][j]=number; number++;
					}
					else
					{
						arr[i][t]=number; number++; t--;
					}
				}
				for(int k=0;k<num;k++)
					System.out.print(arr[i][k]+" ");
				
				System.out.println();
			}
			/*
			for(int i=0;i<num;i++)
			{	
				for(int j=0;j<num;j++)
					System.out.print(arr[i][j]+" ");
				
				System.out.println();
			}
			*/
			
		}
	}
}
