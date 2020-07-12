

//https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int FindLIS(int arr[])
    {
        int n=arr.length;
        if(n==0)
        return 0;
        
        int temp[]=new int[n];
        temp[0]=arr[0];
        int len=1;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]<temp[0])
            temp[0]=arr[i];
            
            else if(arr[i]>temp[len-1])
            temp[len++]=arr[i];
            
            else
            {
                int k=Arrays.binarySearch(temp,0,len,arr[i]);
                
                if(k<0)
                k=-(k+1);
                temp[k]=arr[i];
            }
        }
        return len;
        
    }
	public static void main (String[] args) throws IOException {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int test=Integer.parseInt(bf.readLine());
		
		while(test>0)
		{test--;
		    int n=Integer.parseInt(bf.readLine());
		    int arr[]=new int[n];
		    String s=bf.readLine();
		    String str[]=s.trim().split("\\s+");
		    
		    for(int i=0;i<n;i++)
		    arr[i]=Integer.parseInt(str[i]);
		    
		    
		    System.out.println(FindLIS(arr));
		    
		}
		
	}
}