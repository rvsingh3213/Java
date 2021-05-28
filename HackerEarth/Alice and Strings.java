//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/aliceandstrings-9da62aa7/


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();                // Reading input from STDIN
        String B=br.readLine();

        if(A.equals(B)){System.out.println("YES");return;}

        if(A.length()!=B.length()){System.out.println("NO");return; }

        int len=A.length();
        int arr[]=new int[len];

        for(int i=0;i<len;i++)
        {
            char c=A.charAt(i);
            char d=B.charAt(i);

            arr[i]=d-c;
           // System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max){
                System.out.println("NO");return;
            }
            else
            {
                max=arr[i];
            }
        }
        System.out.println("YES");
        // Write your code here

    }
}
