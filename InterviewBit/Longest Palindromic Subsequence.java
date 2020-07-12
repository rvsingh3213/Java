

//https://www.interviewbit.com/problems/longest-palindromic-subsequence/


public class Solution {
    public int solve(String S) {
        
        int N=S.length();
        
         if(N==0)
            return 0;
        
        int DP[][]=new int[N][N];
        
        for(int i=0;i<N;i++)
            DP[i][i]=1;
        
        for(int Len=2;Len<=N;Len++)
        {
            for(int i=0;i<=N-Len;i++)
            {
                int j=i+Len-1;
                
                if(S.charAt(i)==S.charAt(j)  && Len==2)
                    DP[i][j]=2;
               else if(S.charAt(i)==S.charAt(j))
               {
                   DP[i][j]= 2+ DP[i+1][j-1];
               }
                else
                {
                    DP[i][j]=Math.max(DP[i][j-1],DP[i+1][j]);
                }
            }
            
            
        }
        
        return DP[0][N-1];
        
    }
}
