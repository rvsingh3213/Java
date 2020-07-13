
//https://leetcode.com/problems/reverse-integer/


class Solution {
    public int reverse(int x) {
        
        int flag=0;
        
        if(x<0)
        { flag=1;
            x= -1*x;
        }
        long rev=0L;
        
        while(x>0)
        {
            rev=(10*rev+(x%10));
            x/=10;
                
        }
        
        if(rev<Integer.MAX_VALUE)
        {   if(flag==1)
            return (int)(-1*rev);
            else
            return (int)rev;
        }
        else
            return 0;
    }
}
