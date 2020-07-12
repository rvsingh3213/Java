/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{	
	public void sort(int arr[],int l,int r)
	{
			if(l<r)
			{	//divide array into two halfs
				int m=(l+r)/2;
				
				//calling sort on first half
				sort(arr,l,m);
				
				//calling sort on second half
				sort(arr,m+1,r);
				
				
				//merging two sorted lists
				merge(arr,l,m,r);
				
				
				
			}
	}
	
	public void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<n1;i++)
			arr1[i]=arr[l+i];
		
		for(int i=0;i<n2;i++)
			arr2[i]=arr[m+1+i];
		
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
				arr[k++]=arr1[i++];
			
			else
			{
				arr[k++]=arr2[j++];
			}
			
		}
		//put rest left part values into arr
		while(i<n1)
		{
			arr[k++]=arr1[i++];
		}
		
		//put rest right part values into arr
		while(j<n2)
		{
			arr[k++]=arr2[j++];
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		
		Solution obj=new Solution();
		
		obj.sort(arr,0,N-1); // from 0 to len -1
		
		for(int i=0;i<N;i++)
		System.out.print(arr[i]+" ");
		
		
	}
}
