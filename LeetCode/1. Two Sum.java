class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a=0;
        int ii=0,jj=0;
        int flag=0;
        int N=nums.length;
        for(int i=0;i<N-1;i++)
        {   for(int j=i+1;j<N;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    ii=i;
                    jj=j;
                    flag=1;
                    break;
                } 
            
            }
        if(flag==1)
            break;
        }
        int arr[]={ii,jj};
        return arr;
    }
    
}