



import java.io.*;
import java.util.*;
import java.lang.*;

class Codechef{
	static void sub_Set(int arr[],int N,int size)
	{
		
		if(size>N)
		{
			System.out.println("Invalid");
		}
		int sum=0;int max=0;
		for(int i=0;i<size;i++)
		sum+=arr[i];
		System.out.println("Sum:"+sum);
		for(int i=size;i<N;i++)
		{	sum=sum+arr[i]-arr[i-size];
			System.out.println("Sum:"+sum);
		if(sum>max)
			max=sum;
		
		
		}
		
		System.out.println(max);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int arr2[]=new int[N];
		
		int size=4;
		
		sub_Set(arr,N,size);
		
	}
	
	
}