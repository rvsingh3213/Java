
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Class_Name {
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				int N=Integer.parseInt(bf.readLine());
				
				String line=bf.readLine();
				String str[]=line.trim().split("\\s+");
			
				int arr[]=new int[N];
				
				
				for(int i=0;i<N;i++)
				{	
					arr[i]=Integer.parseInt(str[i]);
				
				}
				
			    int max_so_far=Integer.MIN_VALUE;
				int max_end_here=0;
				
				for(int i=0;i<N;i++)
				{
					max_end_here+=arr[i];
					
					
					if(max_so_far<max_end_here)
						max_so_far=max_end_here;
					
					
					if(max_end_here<0)
						max_end_here=0;
					
						
					
				}
				
				System.out.println(max_so_far);
		}// while test case ends
			
	}
	
	
}


