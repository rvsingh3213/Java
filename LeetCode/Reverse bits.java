
//https://leetcode.com/problems/reverse-bits/submissions/

public class Solution {
  
    public int reverseBits(int n) {
        
       int rev=0;
		int i=0;
		while(i<32)
		{ i++;
			rev<<=1;
			
			if(((int)(n & 1))==1)
				rev++;
			
			n>>=1;
		}
		return rev;
        
    }
}