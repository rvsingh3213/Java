
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
				Long sum=Long.parseLong(s[1]);
				
				
				Long arr[]=new Long[N];
				
				line=bf.readLine();
				String str[]=line.trim().split("\\s+");
				
				Map<Long,Integer> mp=new HashMap<>();
				int flag=0;
				Long tot_sum=0L;
				int start=0,end=0;
				
				for(int i=0;i<N;i++)
				{arr[i]=Long.parseLong(str[i]);
					tot_sum+=arr[i];
					
					if(mp.containsKey((long)tot_sum-sum))
					{	flag=1;
						start=mp.get(tot_sum-sum)+1+1; // 1 added for (index+1)
						end=i+1; 					 // 1 added more coz after this key we start
						break;
					}
					else
						mp.put(tot_sum,i);
						
					if(mp.containsKey(sum))
					{
					    flag=1;
						start=+1;
						end=i+1;
						break;
					}
					
					
				}
				
			if(flag==1)
				System.out.println(start+" "+end);
			else
				System.out.println("-1");
		
			} // while test case loop
		//code
	}
	
	
}















