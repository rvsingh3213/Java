class Solution {
    public void reverseString(char[] s) {
        
        int len=s.length;
        
        int start=0,end=len-1;
        
        while(start<end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;end--;
        }
        
    }
}