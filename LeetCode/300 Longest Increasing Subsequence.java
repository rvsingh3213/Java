
//https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] arr) {
        
        int N=arr.length;
        if(N==0)
            return 0;
        int temp[]=new int[N];
		
		for(int i=0;i<N;i++)
			temp[i]=1;
		
		int max=1;
		for(int i=1;i<N;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i] && temp[i]<temp[j]+1)
					temp[i]=temp[j]+1;
			}
		}
		
		for(int i=0;i<N;i++)
			if(max<temp[i])
				max=temp[i];
			
			return max;
		
        
        
        
    }
}