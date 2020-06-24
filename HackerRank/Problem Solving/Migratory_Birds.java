
//https://www.hackerrank.com/challenges/migratory-birds/problem
//Migratory Birds hacker rank solution

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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        int l=arr.size();
        int max=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            
            
            if(mp.containsKey(arr.get(i)))
            {
                mp.put(arr.get(i),mp.get(arr.get(i))+1);//get is only to fetch key
                                                            // from list
            }
            else
            {
                mp.put(arr.get(i),1);
            }
        }
            int value=0;
            for(Map.Entry<Integer,Integer> e: mp.entrySet())
            {
                if(value<e.getValue())
                {
                    value=e.getValue();
                    max=(e.getKey()).intValue();
                }
            }
        return max;
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
