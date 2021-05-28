
//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/good-sequences-46c31a23/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
       BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

       int t=Integer.parseInt(bf.readLine().trim());

       while(t-->0)
       {
        String s=bf.readLine().trim();

            HashMap<Character,Integer> mp=new HashMap<>();

            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);

                if(mp.containsKey(c))
                {
                    mp.put(c,mp.get(c)+1);
                }
                else
                {
                    mp.put(c,1);
                }
            }

            double mod=1e9+7;
            int totalK=mp.size();
            double max=1;
            for(Map.Entry<Character,Integer> e: mp.entrySet())
            {
                int v=e.getValue();
                max=max*v;
                max=max%mod;

               
            }
            
           
            System.out.println((int)max);
       }
       
       
       
       }
}
