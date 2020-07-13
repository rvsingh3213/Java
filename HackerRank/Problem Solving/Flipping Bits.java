
//https://www.hackerrank.com/challenges/flipping-bits/problem


// only this function need to be completed

 static long flippingBits(long n) {

        String s=Long.toBinaryString(n);
        int l=s.length();
        for(int i=0;i<32-l;i++)
        s="0"+s;

        String ss="";
        for(int i=0;i<32;i++)
        {
            if(s.charAt(i)=='0')
            ss=ss+"1";
            else
            ss=ss+"0";
        }

        return Long.parseLong(ss,2);

    }