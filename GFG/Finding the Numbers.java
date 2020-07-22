

//https://practice.geeksforgeeks.org/problems/finding-the-numbers/0


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
    	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    	
    	int test=Integer.parseInt(bf.readLine());
    	
    	
    	while(test-->0)
    	{
    	    int N=Integer.parseInt(bf.readLine());
    	    
    	    //Long arr[]=new Long[2*N+2];
    	    N=2*N+2;
    	    Long A=0L;
    	    long x=0L,y=0L;
    	    HashMap<Long,Integer> mp=new HashMap<>();
    	    String line=bf.readLine().trim();
    	    String str[]=line.split("\\s+");
    	    
    	    for(int i=0;i<N;i++)
    	    {
    	        A=Long.parseLong(str[i]);
    	        
    	        if(mp.containsKey(A))
    	        {
    	            mp.put(A,mp.get(A)+1);
    	        }
    	        else
    	        {
    	            mp.put(A,1);
    	        }
    	        
    	    }
    	    
    	    int i=0;
    	    for(Map.Entry<Long,Integer> e: mp.entrySet())
    	    {
    	        
    	        if(e.getValue()%2!=0)
    	        {
    	            i++;
    	            if(i==1)
    	             x=e.getKey();
    	            if(i==2)
    	            { y=e.getKey(); break;
    	            }
    	        }
    	        
    	    }
    	   
    	    System.out.println(Math.min(x,y)+" "+Math.max(x,y));
    	    
    	    
    	    
    	}
    	
	 }
}