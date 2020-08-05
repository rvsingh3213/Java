



//https://leetcode.com/problems/power-of-two/
//231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
      
       // System.out.println(13%2);
        
        if(n<=0)return false;
        
        int bits[]=new int[32];
        int count=0;
        for(int i=0;i<32;i++)
        {
            bits[i]=n>>i&1; 
            
            if(bits[i]==1)count++;
        }
        
        if(count==1)return true;
      

        return false;
        
        
    //  ******** Iterative Approach
       /* if(n<=0)return false;
        while(n!=1)
        {
            if(n%2==1)
                return false;
            n=n/2;
            
        }
        return true;*/

    }
}