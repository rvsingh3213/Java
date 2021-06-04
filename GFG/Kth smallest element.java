
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1#

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       PriorityQueue<Integer> queue=new PriorityQueue<>();
       
       for(int i=0;i<arr.length;i++)
       {
           queue.add(arr[i]);
       }
       
       for(int i=0;i<k-1;i++)
       queue.remove();
       
       return queue.peek();
       
    } 
}