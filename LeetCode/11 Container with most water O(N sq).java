class Solution {
    public int maxArea(int[] height) {
        
        int N=height.length;
        if(N==1)
            return 0;
        
        int max=0;
        int area=0;
        int left_V=0;           //left vertical
        int right_V=N-1;        //Righ vertical
        // O(N) complexity
        while(left_V<right_V)
        {
            area=Math.min(height[left_V],height[right_V]) * (right_V-left_V);
            if(area>max)
                max=area;
            
            if(height[left_V]<height[right_V])
                left_V++;
            else
                right_V--;
                
        }
        
        return max;
    }
}