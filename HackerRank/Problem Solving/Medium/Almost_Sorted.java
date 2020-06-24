
//https://www.hackerrank.com/challenges/almost-sorted/problem


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
        
		int N=arr.length;
		int l=0;
		int r=N-1;
		
		//to check left limit of array
		while(l<r && arr[l]<arr[l+1])
			l++;
		//System.out.println(l);
		if(l==r)
			System.out.println("yes");
		
		while(r>l && arr[r]>arr[r-1])
			r--;
		
		
		//to check whether no reverse or swap can be applied
		
		if((l>0	&& arr[l-1]>arr[r]) || (r<N-1 && arr[l]>arr[r+1]))
		{
			System.out.println("no"); return;
		}
		//System.out.println("r:"+r);
		//to check if reverse present
		int m=l+1;
		while(m<r && arr[m]>arr[m+1])
			m++;
		
		if(r==m)
		{System.out.println("yes\n"+((r-l<2)?"swap":"reverse")+" "+(l+1)+" "+(r+1));
			return;
		}
		
		//swap cant be done
		if(m-l>1)
		{	System.out.println("no"); 
			return;
		}
		//System.out.println("m:"+m);
		if(m-l<2)
		{
		while(m<r-1 && arr[m]<arr[m+1])
			m++;
		if(r-m<2)
			System.out.println("yes\n"+"swap"+" "+(l+1)+" "+(r+1));
		else
			System.out.println("no");
		}
		
		
		
	}    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        almostSorted(arr);

        scanner.close();
    }
}