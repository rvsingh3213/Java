
//https://leetcode.com/problems/counting-bits/
//338. Counting Bits

class Solution {
    private int count(int n)
    {
        int count=0;
        
        for(int i=0;i<32;i++)
            count+=n>>i&1;
        
        return count;
    }
    public int[] countBits(int num) {
        
        int arr[]=new int[num+1];
        arr[0]=0;
        
        if(num==0)return arr;
        
        for(int i=1;i<=num;i++)
        {
            arr[i]=count(i);
        }
        
        return arr;
    }
}