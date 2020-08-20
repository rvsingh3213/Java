

//https://leetcode.com/problems/valid-palindrome/
//125. Valid Palindrome

class Solution {
    
    public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("^[a-zA-Z0-9]*$");
	}
    public boolean isPalindrome(String s) {
        
        String ss="";
        
        for(int i=0;i<s.length();i++)
        {
            if(isAlphaNumeric(String.valueOf(s.charAt(i))))
            {
                ss+=String.valueOf(s.charAt(i));
            }
        }
        
        if(ss.length()==1 ||ss.length()==0)return true;
        int i=0,j=ss.length()-1;
        while(i<=j)
        {   char a=Character.toLowerCase(ss.charAt(i));
            char b=Character.toLowerCase(ss.charAt(j));
            if(a!=b)
                return false;
            
            i++;j--;
        }
        
        return true;
    }
}