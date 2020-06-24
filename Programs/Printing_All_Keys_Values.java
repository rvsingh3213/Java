import java.io.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
		*/
		
		Scanner sc=new Scanner(System.in);
		
			
			int N=7;
			int arr[]={2,5,3,4,2,3,3};
			Map<Integer,Integer> mp=new HashMap<>();
			for(int i=0;i<N;i++)
			{
				
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
			//for(Map.Entry<Integer,Integer> entry: mp.entrySet())
			System.out.println("Keys::"+mp.keySet());
		
			System.out.println("Values::"+mp.values());
			
			
				//
			/*for(int i=0;i<mp.size();i++)
			{
				
			}*/
		
		
    }
}