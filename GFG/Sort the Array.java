

//https://practice.geeksforgeeks.org/problems/merge-sort/1/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        int test=Integer.parseInt(bf.readLine());
        
        while(test>0)
        { test--;
        int N=Integer.parseInt(bf.readLine());
        String line=bf.readLine();
        
        String str[]=line.trim().split("\\s+");
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        
        StringBuilder sb=new StringBuilder();
        Arrays.sort(arr);  //can use any efficient sorting method
        
        for(int i=0;i<N;i++)
        sb.append(arr[i]+" ");
        System.out.println(sb.toString());
        
        
            
        }
	}
}