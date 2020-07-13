

//https://practice.geeksforgeeks.org/problems/reverse-bits/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static long RevBits(long n)
    {
        String S=Long.toBinaryString(n);
		int l=S.length();
		for(int i=0;i<32-l;i++) // this one is important step
		{
			S="0"+S;
		}
		StringBuilder sb=new StringBuilder(S);
		
		
		sb=sb.reverse();
		S=sb.toString();
		
		return Long.parseLong(S,2);
    }
	public static void main (String[] args) throws IOException{
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            int test=Integer.parseInt(bf.readLine());
            
            
        while(test>0)
        { test--;
        
            long N=Long.parseLong(bf.readLine());
            
            System.out.println(RevBits(N));
            
        }
    

	
	    
	}
}