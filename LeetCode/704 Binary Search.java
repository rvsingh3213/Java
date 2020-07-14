

//https://leetcode.com/problems/binary-search/


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
    public int search(int[] nums, int target) {
        
       return binarySearch(nums,0,nums.length-1,target);
        
    }
}