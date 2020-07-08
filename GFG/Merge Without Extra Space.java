
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/

import java.lang.*;
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				
				String line=bf.readLine();
				
				String mn[]=line.trim().split("\\s+");

				int m=Integer.parseInt(mn[0]);
				int n=Integer.parseInt(mn[1]);
				
				int arr1[]=new int[m];
				int arr2[]=new int[n];
				
				line=bf.readLine();
				String str1[]=line.trim().split("\\s+");
				
				line=bf.readLine();
				String str2[]=line.trim().split("\\s+");
				
	
				for(int i=0;i<m;i++)
				{   arr1[i]=Integer.parseInt(str1[i]);
					
				}
				
				for(int i=0;i<n;i++)
				{  arr2[i]=Integer.parseInt(str2[i]);
					
				}
				StringBuilder sb=new StringBuilder();
			   int i=0,j=0;
			    while(i< m && j< n)
				{
				    if(arr1[i]<arr2[j])
				    {
				        sb.append(arr1[i]+" ");
				        //System.out.print(arr1[i]+" ");
				        i++;
				    }
				    else
				    {   sb.append(arr2[j]+" ");
				         //System.out.print(arr2[j]+" ");
				         j++;
				    }
				}
				
				while(i<m)
				{   sb.append(arr1[i]+" ");
				    //System.out.print(arr1[i]+" ");
				    i++;
				}
				while(j<n)
				{   sb.append(arr2[j]+" ");
				    //System.out.print(arr2[j]+" ");
			        j++;
				}
				
				System.out.println(sb.toString());
		}// while test case ends
			
	}// main end
	
	
} //class end


