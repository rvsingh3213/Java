
//https://www.codechef.com/problems/GOLMINE


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
		
		int T=Integer.parseInt(bf.readLine());
		
		while(T>0)
		{T--;
			
			int N=Integer.parseInt(bf.readLine());
			
			
			double A_sum=0;
			double B_sum=0;
			for(int i=0;i<N;i++)
			{
				String line=bf.readLine();
				String arr[]=line.trim().split("\\s+");
				
				double G=Double.parseDouble(arr[0]);
				double A=Double.parseDouble(arr[1]);
				double B=Double.parseDouble(arr[2]);
				
				if(A==B)
				{
					A_sum+=G/2;
					B_sum+=G/2;
				}
				else
				{	
					
					B_sum+=(G*(A/(A+B)));
					A_sum+=(G*(B/(A+B)));
					
				}
			}
			
			System.out.println(String.format("%.5f",(A_sum))+" "+String.format("%.5f",(B_sum)));


			//System.out.println(A_sum+" "+B_sum);
		
		}
		
	}
}
