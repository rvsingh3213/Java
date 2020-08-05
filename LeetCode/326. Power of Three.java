

//https://leetcode.com/problems/power-of-three/
//326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        
       
        
        return (Math.log10(n)/Math.log10(3))%1==0;
        
        /*if(n<=0)return false;
        
        while(n!=1)
        {
            if(n%3!=0)
                return false;
            n/=3;
        }
        return true;
        
        */
    }
}