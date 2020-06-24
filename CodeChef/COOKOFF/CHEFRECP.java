
//THIS CODE IS FROM  MAY COOKOFF BELOW IS LINK FROM PROBLEM
//Try to solve yourself frist then see solution
//https://www.codechef.com/COOK118B/problems/CHEFRECP


Chef and Recipe Problem Code: CHEFRECP



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		// your code goes here
		int T=sc.nextInt();
		while(T>0)
		{	T--;
	
		  int N=sc.nextInt();
		  int arr[]=new int[N];
		  Map<Integer,Integer> mp=new HashMap<>();
		  for(int i=0;i<N;i++)
		  {
			  arr[i]=sc.nextInt();
			  if(mp.containsKey(arr[i]))
			  {
			  mp.put(arr[i],(mp.get(arr[i])+1));
			  }
			  else
				mp.put(arr[i],1); 
			  
		  }
		  List<Integer> list=new ArrayList<>();
		  
			for(Map.Entry<Integer,Integer> e: mp.entrySet())
		  {
			 Integer val=e.getValue();
			 list.add(val);
		  }
		  //System.out.println(list);
		  Collections.sort(list);
		  //System.out.println(list);
		  int fflag=1;
		  int prev=list.get(0);
		  for(int i=1;i<list.size();i++)
		  {		
			  if(prev==(list.get(i)))
			  {fflag=0;break;}
		     prev=list.get(i);
		  }
		  if(fflag==0)
		  {System.out.println("NO"); continue; }
		  int go_ing=arr[0];
		  List<Integer> list2=new ArrayList<>();
		  int flag=1;
		  for(int i=1;i<N;i++)
		  {
			  if(go_ing!=arr[i])
			  {		if(list2.contains(arr[i]))
					{flag=0; break;}
				  list2.add(go_ing);
				  go_ing=arr[i];
				    
			  }
		  }
		  
		  if(flag==0)
			  System.out.println("NO");
		  else
			  System.out.println("YES");
		}
	}
}
