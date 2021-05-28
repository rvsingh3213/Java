//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/unique-subsequence-264057c9/


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());                // Reading input from STDIN
       

        while(t-->0)
        {   int len=Integer.parseInt(br.readLine().trim());
            String s=(br.readLine().trim());

            

            int max=0;
            int count=0;

            for(int i=1;i<len;i++)
            {
                char a=s.charAt(i-1);
                char b=s.charAt(i);

                if(a!=b)
                {
                    count++;

                     if(i==(len-1))
                     {
                             max+=count;
                    }

                }
                else{
                    max+=count;
                    count=0;
                }
            }

            System.out.println(max+1);

        }
        // Write your code here

    }
}
