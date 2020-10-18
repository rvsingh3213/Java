

//https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        
        int N=A.size();
		
		int MSF=Integer.MIN_VALUE;  //maximum so far
		int MSEH=0;			// maximum sum end here
		
		for(int i=0;i<N;i++)
		{
			MSEH+=A.get(i);
			
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

