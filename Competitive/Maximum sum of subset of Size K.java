

// sum will be of normal subset not subset with contigous element






import java.io.*;
import java.util.*;
import java.lang.*;

class Codechef{
	static List<Integer> sub_Set(int arr[],int N,int index,int subSet[],int i,int size,List<Integer> list)
	{
		
		if(index==size)
		{	//System.out.print("{ ");
			int sum=0;
			for(int k=0;k<index;k++)
			{
				sum+=subSet[k];
			}	
			if(sum>list.get(0))
				list.add(0,sum);
			
			   return list;
			//System.out.print(subSet[k]+" ");
			
			//System.out.println("");
			
		}
		if(i==N)
		{return list;}
		
		
		subSet[index]=arr[i];
		
		//ecluding element
		sub_Set(arr,N,index+1,subSet,i+1,size,list);
		
		//including element
		sub_Set(arr,N,index,subSet,i+1,size,list);
		
		return list;
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
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		List<Integer> list2=sub_Set(arr,N,0,arr2,0,size,list);
		System.out.println(list2.get(0));
		
	}
	
	
}