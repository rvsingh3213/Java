

//https://leetcode.com/problems/single-number-ii/

// Single number ii leetcode


class Solution {
    public int singleNumber(int[] nums) {
        
        //one Approach ca be using HashMap
        
        //This one is using bits
        
        int arr[]=new int[32];
        
        for(int i=0;i<32;i++)
        {
            for(int n: nums)
            {   arr[i]+=n>>i & 1;
              
                //arr[i]%=3;
            }
        }
        for(int i=0;i<32;i++)
            arr[i]%=3;
        
        int number=0;
        for(int i=0;i<32;i++)
            number |=arr[i]<<i;
        
        
        return number;
        
    }
}