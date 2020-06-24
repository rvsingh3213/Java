class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[]=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k]=nums[i];
            arr[k+1]=nums[n+i];
            k+=2;
            
        }
        
        return arr;
    }
}