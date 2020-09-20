

//58. Length of Last Word
//https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
          s=s.trim();
        int l=s.length();
        int len=0;
      
        if(l==0 || s.charAt(l-1)==' ')return len;
        l--;
        while(s.charAt(l)!=' ')
        {
            len++;l--;
            
            if(l<0)break;
        }
        
        return len;
    }
}