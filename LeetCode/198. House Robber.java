

//198. House Robber
//https://leetcode.com/problems/house-robber/

class Solution {
    //This solution will give TLE as overlapping of execution of same solutoin is there
    public int robRecursive(int arr[],int n)
    {
         if(n==0)return 0;
         if(n==1)return arr[0];
        return Math.max(robRecursive(arr,n-1),(robRecursive(arr,n-2)+arr[n-1]));
    }
    public int rob(int[] nums) {
        
     // return robRecursive(nums,nums.length);
        
        
        //below solution will work with O(n) time complexity
        
        
        int n=nums.length;
        
        if(n==0)return 0;
        if(n==1)return nums[0];
        
        int v1=nums[0];
        int v2=Math.max(v1,nums[1]);
        
        for(int i=2;i<n;i++)
        {
            int temp=v2;
            v2=Math.max(v2,nums[i]+v1);
            v1=temp;
        }
        
        return v2;
    }
}