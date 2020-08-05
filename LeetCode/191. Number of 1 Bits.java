

//https://leetcode.com/problems/number-of-1-bits/
//191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       
         //int bits[]=new int[32];
        int count=0;
        for(int i=0;i<32;i++)
        {
           count+=n>>i&1; 
            
            //if(bits[i]==1)count++;
        }
        
        return count;
        
//alternative solution
   /*     String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                count++;
        }
        
        return count;*/
    }
}