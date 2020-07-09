
//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/


import java.lang.*;
import java.io.*;
import java.util.*;
class GFG {
	
	static void reArrange(long arr[],int n)
	{
		int max_idx = n - 1, min_idx = 0; 
  
        // store maximum element of array 
        long max_elem = arr[n - 1] + 1; 
  
        // traverse array elements 
        for (int i = 0; i < n; i++) { 
            // at even index : we have to put 
            // maximum element 
            if (i % 2 == 0) { 
                arr[i] += (arr[max_idx] % max_elem) * max_elem; 
                max_idx--; 
            } 
  
            // at odd index : we have to put minimum element 
            else { 
                arr[i] += (arr[min_idx] % max_elem) * max_elem; 
                min_idx++; 
            } 
        } 
  
        // array elements back to it's original form 
        for (int i = 0; i < n; i++) 
            arr[i] = arr[i] / max_elem; 
    
	}
	
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
		
			
			
		while(test>0)
		{ test--;
				
				int N=Integer.parseInt(bf.readLine());
				
				String line=bf.readLine();
				String str[]=line.trim().split("\\s+");
				long arr[]=new long[N];
				
				for(int i=0;i<N;i++)
					arr[i]=Long.parseLong(str[i]);
				
				Arrays.sort(arr);
				
				reArrange(arr,N);
				
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<N;i++)
					sb.append(arr[i]+" ");
				
				System.out.println(sb.toString());
				
				
				
				
				
		}// while test case ends
			
	}// main end
	
	
} //class end


