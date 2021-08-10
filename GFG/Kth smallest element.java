
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1#

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++)
        {
            maxHeap.add(arr[i]);
            
            if(maxHeap.size()>k)maxHeap.poll();
        }
       // for(int i=0;i<k;i++)
        //System.out.print(maxHeap.poll()+" ");
        return maxHeap.peek();
       
    } 
}