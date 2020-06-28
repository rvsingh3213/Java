

// https://www.hackerrank.com/challenges/lonely-integer/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt();
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int A=0;
        for(int i=0;i<N;i++)
        {
            A=sc.nextInt();
            
            if(mp.containsKey(A))
            {
                mp.put(A,(mp.get(A)+1));
            }
            else
            {
                mp.put(A,1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {	
			//System.out.println(entry.getKey()+":"+entry.getValue());
            if(entry.getValue()==1)
            { System.out.println(entry.getKey());
                    break;
            }
			
        }
        
    }


 }
