
// Code from Codechef COOK OFF MAY
// https://www.codechef.com/COOK118B/problems/CHEFSHIP

Chef, Chefina and Their Friendship Problem Code: CHEFSHIP


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T>0)
	{	T--;
	
		String s=sc.next();
		
		int n=s.length();
		int count=0;
		String s1="",s2="",s3="",s4="";
		
		for(int i=2;i<(n-1);i+=2)
		{
			s1=s.substring(0,i/2);
			s2=s.substring(i/2,i/2);
			System.out.println(s2+" ");
		//	System.out.println("ii:"+ii);
			if(s1.compareTo(s2)==0)
			{
			s3=s.substring(i,i+ (n-i)/2);
			
			s4=s.substring(i+(n-i)/2,n);
			if(s3.compareTo(s4)== 0)
				count++;
			}
		}
		
		System.out.println(count);
	}
	}
}