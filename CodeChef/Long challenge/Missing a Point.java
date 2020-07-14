
//https://www.codechef.com/JULY20B/problems/PTMSSNG

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
		
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{	test--;
			
			int k=Integer.parseInt(bf.readLine());
			
			//String str[]=new String[2];
			int x1=0;
			int y1=0;
			
			Map<Integer,Integer> mp_x=new HashMap<Integer,Integer>();
			Map<Integer,Integer> mp_y=new HashMap<Integer,Integer>();
			for(int i=1;i<=4*k-1;)
			{
			     
			      
				String line=bf.readLine();
				String str[]=line.split("\\s+");
				 x1=Integer.parseInt(str[0]);
				 y1=Integer.parseInt(str[1]);
				 
				 i++; //after reading 1 point
				 
				 if(mp_x.containsKey(x1))
				 {
					 mp_x.put(	x1, (mp_x.get(x1)+1)  );
				 }
				 else
					 mp_x.put(	x1,1 ); 
					 
				 
				 if(mp_y.containsKey(y1))
				 {
					 mp_y.put(	y1, (mp_y.get(y1)+1)  );
				 }
				 else
					 mp_y.put(	y1,1 ); 
				 
				 //System.out.println("x2:"+x2+" "+" y2:"+y2+" i:"+i);
				 

			}
			for(Map.Entry<Integer,Integer> e: mp_x.entrySet())
			{
				if(e.getValue()%2!=0)
					System.out.print(e.getKey()+" ");
			//	System.out.print(e.getKey()+":"+e.getValue());
			}
			//	System.out.println();
			for(Map.Entry<Integer,Integer> e: mp_y.entrySet())
			{
				if(e.getValue()%2!=0)
					System.out.print(e.getKey()+" ");
					
					//System.out.print(e.getKey()+":"+e.getValue());
			}
			
		}
			
	}
}