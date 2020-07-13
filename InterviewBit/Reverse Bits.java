
//https://www.interviewbit.com/problems/reverse-bits/

public class Solution {
    public long reverse(long n) {
        
         long rev=0L;
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
