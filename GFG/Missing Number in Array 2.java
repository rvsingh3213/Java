
//https://practice.geeksforgeeks.org/problems/missing-number-in-array/0


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
				int N=Integer.parseInt(bf.readLine());
				
				String line=bf.readLine();
				String str[]=line.trim().split("\\s+");
			
				int arr[]=new int[N+1];
				int A=0;
				//This can be done with TreeMap too
				// 
				long sum=0;
				for(int i=0;i<N-1;i++)
				{	
					A=Integer.parseInt(str[i]);
					
					sum+=A;
				
				}
				long tot=N*(N+1)/2;
				
			    System.out.println(tot-sum);
			
		}// while test case ends
			
	}
	
	
}


