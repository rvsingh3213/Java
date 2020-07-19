

//https://www.codechef.com/COOK120B/problems/EVENTUAL

// codechef problem code EVENTUAL


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
			
			
			
			HashMap<Character,Integer> mp=new HashMap<>();
			
			
			for(int i=0;i<N;i++)
			{
				char c=s.charAt(i);
				
				if(mp.containsKey(c))
				{
					mp.put(c,mp.get(c)+1);
				}
				else
				{
					mp.put(c,1);
				}
				
				
			}
			
			int flag=1;
			
			for( Integer e: mp.values())
			{
				if(e%2!=0)
				{
						flag=0;
						break;
				}			
				
				
			}
			
			if(flag==1)
				System.out.println("YES");
			else System.out.println("NO");
			
			
		}//while test case end
			
	}//main method end
	
}//main class end