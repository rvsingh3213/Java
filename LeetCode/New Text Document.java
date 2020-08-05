

//https://leetcode.com/problems/first-missing-positive/submissions/
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
            if(nums[i]==(i+1))
                continue;
            int j=0;
           while(j<L)
           {    
               
               if(nums[j]==(i+1))
               {
                   int temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;                   
                   break;
               }
               
               j++;
               
           }
        }  
        int rt=1;
        for(int i=0;i<L;i++)
        {
            if(nums[i]!=rt)
            {
                return rt;
            }
            rt++;
        }
       /* 
        for(int i=0;i<L;i++)
            System.out.print(nums[i]+" ");
        */
        return  rt;
    }
}
