//https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem


import java.io.*;
import java.util.*;

public class Solution {
   static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        if(b==0)
        return a;
        if(a==b)
        return a;

        if(a>b)
        return gcd(a%b,b);
        else
        return gcd(a,b%a);

    
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(gcd(A,B));


    }
}