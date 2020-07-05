
// this is valid only for positive integer array

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
			
			while(test>0)
			{ test--;
				String line=bf.readLine();
				String s[]=line.trim().split("\\s+");
				
				int N=Integer.parseInt(s[0]);
				long sum=Long.parseLong(s[1]);
				
				
				long arr[]=new long[N];
				
				line=bf.readLine();
				String str[]=line.trim().split("\\s+");
				
				int flag=0;
				Long tot_sum=0L;
				int start=0,end=0;
				
				for(int i=0;i<N;i++)
				{	arr[i]=Long.parseLong(str[i]);
					
				}
				for(int i=0;i<N;i++)
				{
					tot_sum+=arr[i];
					
					while(tot_sum>sum && start<i)
					{		
						tot_sum-=arr[start];
						
						start++;
						
					}
					
					if(tot_sum == sum)
					{	
						flag=1;
						end=i;
						break;
					}
										
		
				}
				
			if(flag==1)
			{
				System.out.println((start+1)+" "+(end+1));
			
			}else
				System.out.println("-1");
		
			} // while test case loop
		//code
	}
	
	
}















