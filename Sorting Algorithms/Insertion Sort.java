
import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
	
	static void InsertionSort(int arr[])
	{
		
		int N=arr.length;
		
		for(int i=1;i<N;i++)
		{	
		  int K=arr[i];
		  
		  int j=i-1;
		  while(j>=0 && arr[j]>K)
		  {
			  arr[j+1]=arr[j];
			  j--;
		  }
		  
		  arr[j+1]=K;	  
		
		}
		
	}
	
	public static void main (String[] args) throws IOException	
	{

		int arr[]={100,2,50,40,11,1,3,4,10};
		InsertionSort(arr);
		
		for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	