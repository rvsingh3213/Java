

//https://leetcode.com/problems/maximum-subarray/

class Solution {
   
         public int maxSubArray(int[] nums) {
		
		int N=nums.length;
		
		int MSF=Integer.MIN_VALUE;  //maximum so far
		int MSEH=0;			// maximum sum end here
		
		for(int i=0;i<N;i++)
		{
			MSEH+=nums[i];
			
			if(MSF<MSEH)
			{
				MSF=MSEH;
			}
			if(MSEH<0)
				MSEH=0;
			
			
		}
     
     return MSF;
        
         }

    
}