

//https://leetcode.com/problems/kth-largest-element-in-an-array/


class Solution {
    public int findKthLargest(int[] nums, int k) {
       int l=nums.length;
        
        
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        
        for(int i=0;i<l;i++)
        {
            queue.add(nums[i]);
        }
        
        for(int i=0;i<(l-k);i++)
        {
            queue.remove();
        }
        
        return queue.peek();
    }
}