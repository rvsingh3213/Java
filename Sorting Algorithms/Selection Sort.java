
import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
	
	static void SelectionSort(int arr[])
	{
		
		int N=arr.length;
		int index=0;
		for(int i=0;i<N-1;i++)
		{	
			index=i;
			for(int j=i+1;j<N;j++)
			{
				if(arr[j]<arr[index])
					index=j;
			}
			
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		
		}
		
	}
	
	public static void main (String[] args) throws IOException	
	{

		int arr[]={100,2,50,40,11,1,3,4,10};
		
		SelectionSort(arr);
		
		for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
	}
	
	
	
	}
	