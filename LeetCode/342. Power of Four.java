

//https://leetcode.com/problems/power-of-four/
//342. Power of Four


class Solution {
    public boolean isPowerOfFour(int num) {
        
        if(num<=0)return false;
       
        if(num==1)return true;
        
        int bits[]=new int[32];
        
        for(int i=0;i<32;i++)
        {
            bits[i]=num>>i&1;
            
        }
        int count=0;
        for(int i=0;i<32;i++)
        {   
            if(i%2!=0)
            if(bits[i]==1)
                return false;
            
            if(bits[i]==1)
            {
                count++;
                if(count>1)return false;
            }
        }
        return true;
        
        
      /*  if(num<=0)return false;
        
        while(num!=1)
        {
            if(num%4!=0)
                return false;
            num=num/4;
            
        }
        return true;
        */
    }
}