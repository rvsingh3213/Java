class Solution {
    public int removeDuplicates(int[] nums) {
        
       int l=nums.length;
        
        int i=0;
        for(int curr_i=0;curr_i<l;curr_i++)
        {
            if(nums[i]==nums[curr_i])
            {
                
            }
            else
            {
                i++;
                nums[i]=nums[curr_i];
            }
            
        }
        
        return i+1;
        
    }
}