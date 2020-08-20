
//https://leetcode.com/problems/goat-latin/

class Solution {
    public String toGoatLatin(String S) {
        String arr[]=S.trim().split("\\s+");
        S="";
        int len=arr.length;
        String a="";
        for(int i=0;i<len;i++)
        {
            a+="a";
            int c=(int)Character.toLowerCase(arr[i].charAt(0));
           if(c==97 ||c==(96+5)||c==(96+9)||c==(96+15)||c==(96+21))
           {
               S+=arr[i]+"ma"+a+" ";
           }
            else
            {   
               if(arr[i].length()>1) 
               S+=arr[i].substring(1,arr[i].length())
                   +String.valueOf(arr[i].charAt(0))+"ma"
                   +a+" ";
                else
                    S+=arr[i]+"ma"+a+" ";
            }
        }
        
        return S.trim();
    }
}