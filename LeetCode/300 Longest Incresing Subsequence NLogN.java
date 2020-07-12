

//https://leetcode.com/problems/longest-increasing-subsequence/solution/

class Solution {
    

    public int lengthOfLIS(int[] arr) {
        
        int n=arr.length;
        
        if(n==0)
            return 0;
        
        int temp[]=new int[n];
        temp[0]=arr[0];
        int len=1;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]<temp[0])
                temp[0]=arr[i];
            
           else if(arr[i]>temp[len-1])
           {
               temp[len++]=arr[i];
           }
            else
            {
                int k=Arrays.binarySearch(temp,0,len,arr[i]);
                
                if(k<0)
                    k=-(k+1);
                
                temp[k]=arr[i];
            }
            
        }
        return len;
        
    }
}