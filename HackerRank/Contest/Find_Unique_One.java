
//Finding Unique Ones

//https://www.hackerrank.com/contests/crescent-practice-3rd-years/challenges/find-the-unique-one




import java.io.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int t=1;
        while(T>0)
        {        T--;
            
            int N=sc.nextInt();
            int arr[]=new int[N];
            Map<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<N;i++)
            {
                arr[i]=sc.nextInt();
                //mp.put(arr[i],i);
                if(mp.containsKey(arr[i]))
                {
                    mp.put(arr[i],mp.get(arr[i])+1);
                }
                else
                {
                    mp.put(arr[i],1);
                }
            }
            for(Map.Entry<Integer,Integer> entry: mp.entrySet())
            {//int a=entry.getKey();
                if((entry.getValue())%2!=0)
                System.out.println("Case "+t+": "+entry.getKey());
            }
                t++;
            
                //
            /*for(int i=0;i<mp.size();i++)
            {
                
            }*/
        }
        
    }
}