

//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
       int maxSoFar=Integer.MIN_VALUE;
       int maxEndHere=0;
       
       for(int i=0;i<n;i++)
       {
           maxEndHere+=arr[i];
           
           if(maxEndHere>maxSoFar)
           {
               
               maxSoFar=maxEndHere;
           }
           
           if(maxEndHere<0)
           {
               maxEndHere=0;
           }
       }
            
            return maxSoFar;
    }
    
}
