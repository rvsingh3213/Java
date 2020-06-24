HackerRank solution Sock Merchant

//https://www.hackerrank.com/challenges/sock-merchant/problem


//can do by sort but there is one issue comes try doing by Arrays.sort();
//4 5 5 5 6 6 4 1 4 4 3 6 6 3 6 1 4 5 5 5 in such situation


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

       int pair=0;

       Map<Integer,Integer> mp=new HashMap<>();

       for(int i=0;i<n;i++)
       {
           if(mp.containsKey(ar[i]))
           {
               mp.put(ar[i],mp.get(ar[i])+1);
           }
           else
           mp.put(ar[i],1);
       }
       
       for(Map.Entry<Integer,Integer> e:mp.entrySet())
       {
           int p=e.getValue()/2;
           pair+=p;
       }
       return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
