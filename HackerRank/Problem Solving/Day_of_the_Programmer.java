
//https://www.hackerrank.com/challenges/day-of-the-programmer/problem
// Day of the Programmer

//function need to be completed

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        boolean feb=false;
        if(year==1918)
        return "26.09."+year;// becase 256-243=26   feb month will start from 14
                                // 13 days excluded
        if(year<1918)
            if(year%4==0)
                feb=true;
        if(year>1918)
        {if(year%400==0)
                feb=true;
         if(year%100!=0)
             if(year%4==0)
                 feb=true;
             
        }
        int a=256;
        if(feb)
        {
            a=256-244;
        }
        else
            a=256-243;
        String s=String.valueOf(a)+".09."+year;
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
