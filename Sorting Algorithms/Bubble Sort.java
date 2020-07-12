
import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
	
	static void BubbleSort(int arr[])
	{
		
		int N=arr.length;
		
		for(int i=0;i<N-1;i++)
		{	
		   for(int j=0;j<N-1-i;j++)
		   {
			if(arr[j]>arr[j+1])
			{			
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		   }
		
		}
		
	}
	
	public static void main (String[] args) throws IOException	
	{

		int arr[]={100,2,50,40,11,1,3,4,10};
		BubbleSort(arr);
		
		for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
	}
	
	
	
	}
	