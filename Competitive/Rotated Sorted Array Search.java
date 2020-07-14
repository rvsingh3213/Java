
import java.lang.*;
import java.util.*;

class Solution {
   	
		static int pivotBasedSearch(int arr[],int K)
		{
			int n=arr.length;
			
			int pivot=findPivot(arr,0,n-1);
			
			if(pivot == -1) //lucky no rotation
			 return binarySearch(arr,0,n-1,K);
			
			if(arr[pivot]==K)
				return pivot;
			
			if(arr[0]>=K)
				return binarySearch(arr,pivot+1,n-1,K);
			
			return binarySearch(arr,0,pivot-1,K);
		
			
		}
		
		
		static int findPivot(int arr[],int left,int right)
		{
			if(right<left)
				return -1;
			if(left==right)
				return left;
			
			int m=(left +right)/2;
			
			if( m<right	&& arr[m]>arr[m+1])
				return m;
			if(	left< m	&& arr[m-1]>arr[m])
				return m-1;
			
			if(arr[left]>=arr[m])
				return findPivot(arr,left,m-1);
			return findPivot(arr,m+1,right);
		}
		
		static int binarySearch(int arr[],int l,int r,int x)
		{
			
			if(r>=l)
			{
				int m=l+(r-l)/2;
				
				if(arr[m]==x)
					return m;
				
				if(arr[m]>x)
					return binarySearch(arr,l,m-1,x);
				
				if(arr[m]<x)
					return binarySearch(arr,m+1,r,x);
				
				
			}
			return -1;
				
		}
	public static void main(String args[])
	{
	
		int arr[]={1, 7, 67, 133, 178};
		int x=1;
		
		System.out.println(pivotBasedSearch(arr,x));
	
	}
}