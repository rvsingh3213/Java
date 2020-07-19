

//https://www.codechef.com/COOK120B/problems/ORTHODOX
//OR-thodox Distinction 


import java.io.*;
import java.util.*;
import java.lang.*;

class Codechef {
	
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		
		int test=Integer.parseInt(bf.readLine());
		
		
		while(test-->0)
		{
			
			int N=Integer.parseInt(bf.readLine());
			
			String s=bf.readLine();
			s=s.trim();
			
			String str[]=s.split("\\s+");
			long arr[]=new long[N];
			
				HashSet<Long> hs=new HashSet<>();
			for(int i=0;i<N;i++)
			{	arr[i]=Long.parseLong(str[i]);
			      hs.add(arr[i]);
			
			}
		
			
			int fflag=1;
			long A=0,B=0;
			for(int i=0;i<N;i++)
			{     B=arr[i];
			    for(int j=i+1;j<N;j++)
			    {  A=arr[j];
			          B=B | A;
			         
			         // B=arr[j];
			          
			          if(hs.contains(B) )// || hs.contains(arr[i] | A))
			          {
			                fflag=0; break;
			          }
			         else
			          {
			                hs.add(B);
			               // hs.add(A | arr[i]);
			                
			          }
			          
			    }
			    
			}
			    
			    if(fflag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		/*	
			int bits[]=new int[32];
			for(int j=0;j<32;j++)
			for(int i=0;i<N;i++)
			{
				bits[j]+=arr[i] >> j & 1;		
				
				
				
			}
			
			int flag=0; int count=0;
			for(int i=0;i<32;i++)
			{
				if(bits[i]==2)
					count++;
			}
				
			if(count==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		*/	
			
		}	
		
	}
	
}
