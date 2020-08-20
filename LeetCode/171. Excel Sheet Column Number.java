

//https://leetcode.com/problems/excel-sheet-column-number/
//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String s) {
        
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            count=count*26+((int)s.charAt(i)-64);
        }
        
        return count;
    }
}