import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the larrysArray function below.
    static boolean Inv_Array(int arr[])
    {
        int N=arr.length;
        int count=0;
        for(int i=0;i<N-1;i++)
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
            
        if(count%2==0)
            return true;
        else
            return false;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int test=sc.nextInt();
        
        while(test>0)
        { test--;
    
            int N=sc.nextInt();
            
            int arr[]=new int[N];
           
            
            for(int i=0;i<N;i++)
                arr[i]=sc.nextInt();
            
            boolean result=Inv_Array(arr);
            if(result)
                System.out.println("YES");
            else
            System.out.println("NO");
            
            
            
        }
        
        
    }


 }