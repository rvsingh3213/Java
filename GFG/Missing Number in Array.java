
//https://practice.geeksforgeeks.org/problems/missing-number-in-array/0

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
				//Map<Integer,Integer>
				for(int i=0;i<N-1;i++)
				{	
					A=Integer.parseInt(str[i]);
					arr[A]++;
				
				}
				
			    for(int i=1;i<N+1;i++)
				{
					if(arr[i]==0)
					{
						System.out.println(i);
						break;
					}	
				}
				
			
		}// while test case ends
			
	}
	
	
}


