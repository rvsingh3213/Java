class Solution {
    public int removeElement(int[] nums, int val) {
     
        int i=0;
        int l=nums.length;
        for(int curr_i=0;curr_i<l;curr_i++)
        {
            if( (nums[i]!=val)&&(nums[curr_i]==val) )
            {
                i=curr_i; continue;
            }
            
            if( (nums[i]==val)&&(nums[curr_i]!=val) )
            {
                int swap=nums[curr_i];
                    nums[curr_i]=nums[i];
                    nums[i]=swap;
                    i++;
            }
            
        }
        //if there are rest of elements left which arent = to val
        for(int k=i;k<l;k++)
        {
            if(nums[k]==val)
                break;
            i++;
        }
        
        return i;
    }
}