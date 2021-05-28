//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/master-cf6dadd7/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
import java.lang.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-->0)
        {
            String s=br.readLine().trim();
            int len=s.length();
            char[] vowel=new char[len];

            int l=0;

            for(int i=0;i<len;i++)
            {   char c=s.charAt(i);
                if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u')
               { vowel[l++]=c;}
            }

            boolean inc=true,dec=true;

           
          // System.out.print("l:"+l);
            for(int i=1;i<l;i++)
            {   
                    
                    {
                       int A=vowel[i-1];
                      int B=vowel[i];
                   //     System.out.println(""+vowel[i-1])+":"+vowel[i]));
                   if(A==B)continue;
                       if(!(A<B)){inc=false;}
                       if(!(A>B)){dec=false;}
                       
                    }
                
                //   int a=vowel[i];
                //  System.out.print(a);
            }
            if(inc){System.out.println("Good");}
            else if(dec){System.out.println("Worst");}
            else{System.out.println("Bad");}
            
        }

        // Write your code here

    }
}
