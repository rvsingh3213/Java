
//https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
        
       int slow=nums[0];
       int fast=nums[0];
        
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        fast=nums[0];
        
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}


// Alternative SOlution
/*class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> st=new HashSet<>();
        
        for(Integer i: nums)
        {
            if(st.contains(i))
                return i;
            
            st.add(i);
                
        }
        return -1;
        
    }
}

*/
