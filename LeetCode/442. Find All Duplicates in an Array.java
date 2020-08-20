

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int L=nums.length;
        for(int i=0;i<L;i++)
        {   int pos=Math.abs(nums[i])-1;
            if(nums[pos]>0)
                nums[pos]*=-1;
            else
                list.add(pos+1);                
        }
        
        return list;
    }
}