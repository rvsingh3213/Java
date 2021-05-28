//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/rotation-1-38ecf5a7/



import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bf.readLine().trim());

        String s=bf.readLine().trim();
        String t=bf.readLine().trim();

        if(s.equals(t))System.out.println("0");
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                j++;
            }
            else
            {
                j=0;
            }
        }
        System.out.println(n-j);
    }
}
