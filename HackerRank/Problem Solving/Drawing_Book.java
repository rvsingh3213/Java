
HackerRank drawing book problem giHUb
//https://www.hackerrank.com/challenges/drawing-book/problem

// pageCount() function to be done

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
         if(n==1 || (n==p))
         return 0;
        int num1=0,num2=0;
        if(n%2!=0)
            if(p==(n-1))
            return 0;
        else 
            if(p==(n-1))
            return 1;
        num1=p/2;
        num2=(n-p);
        if(num2!=1)
        num2/=2;

        if(num1<num2)
            return num1;
        else
            return num2;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
