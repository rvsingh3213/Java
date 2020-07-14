
//https://www.codechef.com/JULY20B/problems/CHEFSTR1
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{	test--;
			
			int N=Integer.parseInt(bf.readLine());
			
			String line=bf.readLine();
			
			String str[]=line.trim().split("\\s+");
			
			int arr[]=new int[N];
			int count=0;
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(str[i]);
			}
				
			for(int i=0;i<N-1;i++)
			{
				count+=( Math.abs(arr[i]-arr[i+1]) -1);
			}
			
			System.out.println(count);
		}
			
	}
}
