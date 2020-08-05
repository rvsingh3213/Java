
//https://practice.geeksforgeeks.org/problems/power-of-four/1
//Power of Four

class GfG
{
    int isPowerOfFour(long num)
    {
        double ans=Math.log10(num)/Math.log10(4);
        
        if((int)ans-ans==0)
        return 1;
        
        return 0;
		//Alternate solution
      /*  if(num<=0)return 0;
       
        if(num==1)return 1;
        
        int bits[]=new int[64];
        
        for(int i=0;i<64;i++)
        {
            bits[i]=(int)(num>>(long)i&1);
            
        }
        int count=0;
        for(int i=0;i<64;i++)
        {   
            if(i%2!=0)
            if(bits[i]==1)
                return 0;
            
            if(bits[i]==1)
            {
                count++;
                if(count>1)return 0;
            }
        }
        return 1;
        
        */
        
    }
}