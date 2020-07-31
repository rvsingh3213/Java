

//https://leetcode.com/problems/powx-n/submissions/
// 50. Pow(x, n)

class Solution {
  private double find(double x,long n)
   {
        if(n==0)return 1;
        if(n==1)return x;
        
        if(n<0) return find(1/x,-1*n);
    
        double result=find(x*x,n/2);
        if(n%2!=0)
            result*=x;
        
        return result;
   }
    public double myPow(double x, int n) { // this could also be handled in this func
                                            // but –2,147,483,648 to 2,147,483,647 is the range of 
                                            // int min is ...648 going to positive ...648 wont be 
                                            //handled
        
       return find(x,(long)n);
        
    }
}