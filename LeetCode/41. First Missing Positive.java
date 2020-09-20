

//https://leetcode.com/problems/first-missing-positive/
//41. First Missing Positive



class Solution {
    public int firstMissingPositive(int[] nums) {
        
         int L=nums.length;
        
        if(L==0)return 1;
        
        if(L==1) {
            if(nums[0]==1)
                return 2;
            else
                return 1;
        }
        
        
        for(int i=0;i<L;i++)
        {
            int pos=nums[i]-1;  // is for position
            
            while(nums[i]>=1 && nums[i]<=L && nums[i]!=(nums[pos]))
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                
                pos=nums[i]-1; // position updated
            }            
            
        }
        
        for(int i=0;i<L;i++)
        {
            if(nums[i]!=(i+1))
                return (i+1);
        }
        
        return L+1;
        
    }
}