
//Isolation Centers Problem Code: CORUS
// May challenge 2020
//https://www.codechef.com/MAY20B/problems/CORUS





/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T > 0)
		{    T--;
			int N=sc.nextInt();
			int Q=sc.nextInt();
			String s=sc.next();
			s=s.toLowerCase();
			long query[]=new long[Q];
			for(int i=0;i<Q;i++)
			{query[i]=sc.nextLong();}
			
			Map<Character,Long> mp=new HashMap<>();
			
			Map<Character,Long> mp_p=new HashMap<>();
			char arr[]=s.toCharArray();
			
			for(int i=0;i<N;i++)
			{
				char c=arr[i];
				
				if(!(mp.containsKey(c)))
				{
					mp.put(c,1L);
				}
				else
				{
					if(mp_p.containsKey(c))
					{
						mp_p.put((Character)c,mp_p.get(c)+1);
					}
					else
					{
						mp_p.put((Character)c,1L);
					}
				}
				
			}
			/*for(Map.Entry<Character,Integer> e:mp_p.entrySet())
			{System.out.println(e.getKey()+":"+e.getValue());}
			*/
			
			for(int i=0;i<Q;i++)
			{	long count=0; long qq=query[i]-1; long val;
			     
			     	if(qq==(-1))
					{
						count=s.length();
					}
					else
				for(Map.Entry<Character,Long> e:mp_p.entrySet())
				{	char cs=e.getKey();
				     val=(long)mp_p.get(cs);
				     
					if(qq==0)
					{
						count+=val;continue;
					}
				
					if(!(qq>=val))
					{count+=(val-qq);}
					else
					{
						//System.exit(0);
					}
				}
				System.out.println(count);
				
			}
		}
	}
}
