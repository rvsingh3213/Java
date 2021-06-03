//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/largest-balanced-string-bf93ce85/


 
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
 

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());

        while(t-->0)
        {
            String s=br.readLine().trim();
            int arr[]=new int[6];

            for(int i=0;i<s.length();i++)
            {   char c=s.charAt(i);
                if(c=='(')
                {
                    arr[0]++;
                }
               else if(c==')')
                {
                    arr[1]++;    
                }
               else if(c=='[')
                {
                    arr[2]++;    
                }
               else if(c==']')
                {
                    arr[3]++;
                }
               else if(c=='{')
                {
                    arr[4]++;                        
                }    
               else
                {
                    arr[5]++;
                }
            }

            int max=0;

            max+=Math.min(arr[0],arr[1])+Math.min(arr[2],arr[3])+Math.min(arr[4],arr[5]);

            System.out.println(2*max);
        }
    }
}
