
//Subset Sum Problem
//	https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1/


class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        
            boolean dp[][]=new boolean[N+1][sum+1];
            
            // wt---arr[]
            //w-----sum
            
            for(int i=0;i<N+1;i++)
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)dp[i][j]=false;
                if(j==0)dp[i][j]=true;
                
            }
            
            for(int i=1;i<N+1;i++)
            for(int j=1;j<sum+1;j++)
            {
                
                if(arr[i-1]<=j)
                dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
                
                else
                dp[i][j]=dp[i-1][j];
                
            }
            
            return dp[N][sum];
    }
}