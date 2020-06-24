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
		
		while(T>0)
		{		T--;
			
			int N=sc.nextInt();
			int arr[]=new int[N];
			Map<Integer,Integer> mp=new HashMap<>();
			for(int i=0;i<N;i++)
			{arr[i]=sc.nextInt();
				mp.put(arr[i],i);
			}
			for(Integer itr: mp.keySet())
				System.out.print(itr+" ");
			/*for(int i=0;i<mp.size();i++)
			{
				
			}*/
		}
		
    }
}