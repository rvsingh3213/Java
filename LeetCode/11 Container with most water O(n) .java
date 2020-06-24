class Solution {
    public int maxArea(int[] height) {
        
        int N=height.length;
        int max=0;
        int area=0;
        for(int i=1;i<N;i++)
            for(int j=0;j<i;j++)
            {
                if(height[j]<height[i])
                {
                    area=height[j]*(i-j);
                    
                    if(area>max)
                    {
                        max=area;
                    }
                }
                else
                {
                    area=height[i]*(i-j);
                    
                    if(area>max)
                    {
                        max=area;
                    }
                }
            }
        
        return max;
    }
}