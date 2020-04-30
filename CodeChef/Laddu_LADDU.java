Laddu Problem Code LADDU


Problem Code LADDU

https://www.codechef.com/viewsolution/31525661

import java.io.*;
import java.util.*;
import java.lang.*;


class CodeChef{
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
		int sum;
		
		for(int i=0;i<T;i++)
		{
		    String s[]=br.readLine().split(" ");
			int act=Integer.parseInt(s[0]);
			sum=0;
			
			for(int j=0;j<act;j++)
			{
				String arr[]=br.readLine().split(" ");
			     
				 if(arr[0].equals("CONTEST_WON"))
				 {
					 sum+=300;
					int  rank=Integer.parseInt(arr[1]);
					 if(rank<20)
					 {
						 sum=sum+(20-rank);
					 }

				 }
				 
				  if(arr[0].equals("TOP_CONTRIBUTOR"))
				 {
					 sum+=300;
				 }
				 
				 if(arr[0].equals("BUG_FOUND"))
				 {  int s_tivity=Integer.parseInt(arr[1]);
					  sum+=s_tivity;
				 }
				 if(arr[0].equals("CONTEST_HOSTED"))
				 {
					 sum+=50;
				 }
			}
			
			if(s[1].equals("INDIAN"))
				System.out.println(sum/200);
			else
				System.out.println(sum/400);
			
		}
		
		
	}
	
	
	
	
}