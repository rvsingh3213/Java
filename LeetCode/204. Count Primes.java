

//https://leetcode.com/problems/count-primes/

//204. Count Primes

class Solution {
    public int countPrimes(int n) {
        
        if(n<=2)return 0;
         boolean prime[]=new boolean[n];
        
        Arrays.fill(prime,true);
        int count;
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]){
                
                for(int j=i;j*i<n;j++)
                {
                    prime[j*i]=false;
                }
                
            }
            
        }
        
        count=0;
        for(int i=2;i<n;i++)
            if(prime[i])
                count++;

return count;
        
    
        
    }
}

