
import java.lang.*;
import java.util.*;

class Solution {
   	
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
	
		int arr[]={2, 3, 4, 10, 40,55,257,8868};
		int x=8868;
		
		System.out.println(binarySearch(arr,0,arr.length-1,x));
	
	}
}