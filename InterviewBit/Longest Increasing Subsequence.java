
//https://www.interviewbit.com/problems/longest-increasing-subsequence/

public class Solution {
    
    public int lis(final List<Integer> A) {
        
        int N=A.size();
        
        int temp[]=new int[N];
        
        for(int i=0;i<N;i++)
            temp[i]=1;
        
        int max=1;
        for(int i=1;i<N;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A.get(j)<A.get(i) && temp[i]<temp[j]+1)
                    temp[i]=temp[j]+1;
            }
        }
        
        for(int i=0;i<N;i++)
            if(max<temp[i])
                max=temp[i];
            
            return max;
    }
}
